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

}
