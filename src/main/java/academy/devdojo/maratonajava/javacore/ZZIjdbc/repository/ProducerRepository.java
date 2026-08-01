package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer){
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try(Connection conn = ConectionFactory.getConnection();
            Statement smt = conn.createStatement();){
            int rowsAffected = smt.executeUpdate(sql);
            log.info("Inserted producer '{}' in the database, rows effect '{}' ", producer.getName(), rowsAffected);

        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'",producer.getName(),e);
        }
    }


    public static void saveTransaction(List<Producer> producers){
        try(Connection conn = ConectionFactory.getConnection()){
            conn.setAutoCommit(false);
            preparedStatementsaveTransaction(conn,producers);
            conn.commit();

        } catch (SQLException e) {
            log.error("Error while trying to save producer '{}'",producers,e);
        }
    }


    private static void preparedStatementsaveTransaction(Connection conn,List<Producer> producers) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?);";
        boolean shouldRollBack = false;
        for (Producer p: producers)
            try(PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                log.info("Saving producer '{}'", p.getName());
                preparedStatement.setString(1, p.getName());
                preparedStatement.execute();

            } catch(SQLException e){
                e.printStackTrace();
            }
        if (shouldRollBack) conn.rollback();
    }


    public static void delet(int id){
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);
        try(Connection conn = ConectionFactory.getConnection();
            Statement smt = conn.createStatement();){
            int rowsAffected = smt.executeUpdate(sql);
            log.info("Deleted producer '{}' from the database, rows effect '{}' ", id, rowsAffected);

        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'",id,e);
        }
    }


    public static void update(Producer producer){
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '  %s ' WHERE (`id` = '%d');"
                .formatted(producer.getName(), producer.getId());
        try(Connection conn = ConectionFactory.getConnection();
            Statement smt = conn.createStatement();){
            int rowsAffected = smt.executeUpdate(sql);
            log.info("Update producer '{}' from the database, rows effect '{}' ", producer.getId(), rowsAffected);

        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'",producer.getId(),e);
        }
    }


    public static void updatePreparedStstement(Producer producer){
        try(Connection conn = ConectionFactory.getConnection();
            PreparedStatement ps = preparedStatementFindByNameUpdate(conn,producer);){
            int rowsAffected = ps.executeUpdate();
            log.info("Update producer '{}' from the database, rows effect '{}' ", producer.getId(), rowsAffected);

        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'",producer.getId(),e);
        }
    }


    private static PreparedStatement preparedStatementFindByNameUpdate(Connection conn,Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1,producer.getName());
        preparedStatement.setInt(2,producer.getId());
        return preparedStatement;
    }


    public static List<Producer> findAll(){
        log.info("Finding all Producers");
        return findByName("");
//        String sql = "SELECT id, name FROM anime_store.producer;";
//        List<Producer> producers = new ArrayList<>();
//        try(Connection conn = ConectionFactory.getConnection();
//            Statement smt = conn.createStatement();
//            ResultSet rs = smt.executeQuery(sql)){
//
//                while(rs.next()){
//                    Producer producer = Producer.builder()
//                            .id(rs.getInt("id"))
//                            .name(rs.getString("name"))
//                            .build();
//                    producers.add(producer);
//                }
//
//        } catch (SQLException e) {
//            log.error("Error while trying to find all insert producer",e);
//        }
//        return producers;
    }


    public static List<Producer> findByName(String name){
        log.info("Finding all Producers by name");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try(Connection conn = ConectionFactory.getConnection();
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql)){

            while(rs.next()){
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all insert producer",e);
        }
        return producers;
    }


    public static List<Producer> findByNamePrepareStatement(String name){
        log.info("Finding all Producers by name");
        List<Producer> producers = new ArrayList<>();
        try(Connection conn = ConectionFactory.getConnection();
            PreparedStatement ps = preparedStatementFindByName(conn,name);
            ResultSet rs = ps.executeQuery()){

            while(rs.next()){
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all insert producer",e);
        }
        return producers;
    }

    public static List<Producer> findByNameCallableStatement(String name){
        log.info("Finding all Producers by name");
        List<Producer> producers = new ArrayList<>();
        try(Connection conn = ConectionFactory.getConnection();
            PreparedStatement ps = callableStatementFindByName(conn,name);
            ResultSet rs = ps.executeQuery()){

            while(rs.next()){
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all insert producer",e);
        }
        return producers;
    }

    private static PreparedStatement preparedStatementFindByName(Connection conn,String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1,String.format("%%%s%%",name));
        return preparedStatement;
    }

    private static CallableStatement callableStatementFindByName(Connection conn,String name) throws SQLException {
        String sql = "CALL `anime_store`.`sp_get_producer_by_name` (?);";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString(1,String.format("%%%s%%",name));
        return cs;
    }


    public static void showProducerMetaDate(){
        log.info("Showing  Producers meta date");
        String sql = "SELECT * FROM anime_store.producer";
        try(Connection conn = ConectionFactory.getConnection();
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql)) {
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int columnCount = rsMetaData.getColumnCount();
            log.info("Coumns count '{}'",columnCount);
            for (int i = 1; i <= columnCount; i++) {
                log.info("Table name '{}'",rsMetaData.getTableName(i));
                log.info("Table name '{}'",rsMetaData.getColumnName(i));
                log.info("Table name '{}'",rsMetaData.getColumnDisplaySize(i));
                log.info("Table name '{}'",rsMetaData.getColumnType(i));
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all insert producer",e);
        }
    }



    public static void showDriverMetaDate(){
        log.info("Showing  Producers meta date");
        String sql = "SELECT * FROM anime_store.producer";
        try(Connection conn = ConectionFactory.getConnection()) {
            DatabaseMetaData dbmetaData = conn.getMetaData();
            if (dbmetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)){
                log.info("Supports TYPE_FORWARD_ONLY ");
                if (dbmetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE)){
                    log.info(" And supports CONCUR_UPDATABLE ");

                }
            }

            if (dbmetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                log.info("Supports TYPE_SCROLL_INSENSITIVE ");
                if (dbmetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE)){
                    log.info(" And supports CONCUR_UPDATABLE ");

                }
            }

            if (dbmetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
                log.info("Supports TYPE_SCROLL_SENSITIVE ");
                if (dbmetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE)){
                    log.info(" And supports CONCUR_UPDATABLE ");

                }
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all insert producer",e);
        }
    }



    public static void showTypeScrollWorking(){
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';";
        try(Connection conn = ConectionFactory.getConnection();
            Statement smt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = smt.executeQuery(sql)) {

           log.info( "Last row? '{}'",rs.last());
           log.info(Producer.builder()
                   .id(rs.getInt("id"))
                   .name(rs.getString("name"))
                   .build());

        } catch (SQLException e) {
            log.error("Error while trying to find all insert producer",e);
        }
    }




    public static List<Producer> findByNameAndUpdateToUpperCase(String name){
        log.info("Finding all Producers by name");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try(Connection conn = ConectionFactory.getConnection();
            Statement smt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = smt.executeQuery(sql)){

            while(rs.next()){
                rs.updateString("name",rs.getString("name").toUpperCase());
                rs.updateRow();
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all insert producer",e);
        }
        return producers;
    }



    public static List<Producer> findByNameAndInsertWhenNotFound(String name){
        log.info("Finding all Producers by name");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try(Connection conn = ConectionFactory.getConnection();
            Statement smt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = smt.executeQuery(sql)){
            if (rs.next()) return producers;

            insertNewProducers(name, rs, producers);

        } catch (SQLException e) {
            log.error("Error while trying to find all insert producer",e);
        }
        return producers;
    }

    private static void insertNewProducers(String name, ResultSet rs, List<Producer> producers) throws SQLException {
        rs.moveToInsertRow();
        rs.updateString("name", name);
        rs.insertRow();
        producers.add( getProducer(rs));
    }

    private static Producer getProducer(ResultSet rs) throws SQLException {
        rs.beforeFirst();
        rs.next();
        Producer producer;
        producer = Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
        return producer;
    }




    public static void findByNameAndDelte(String name){
        log.info("Finding all Producers by name");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';"
                .formatted(name);
        try(Connection conn = ConectionFactory.getConnection();
            Statement smt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = smt.executeQuery(sql)){
            while(rs.next()) {
                log.info("Deleting '{}'",rs.getString("name"));
                rs.deleteRow();
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all insert producer",e);
        }
    }

}
