package academy.devdojo.maratonajava.javacore.ZZJcrud.Repository;


import academy.devdojo.maratonajava.javacore.ZZJcrud.conn.ConectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Log4j2
public class ProducerRepository {

    public static List<Producer> findByName(String name) {
        log.info("Finding all Producers by name '{}'", name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all insert producer", e);
        }
        return producers;
    }



    private static PreparedStatement createPreparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,String.format("%%%s%%",name));
        return ps;
    }


    public static Optional<Producer> findById(Integer id) {
        log.info("Finding all Producers by id '{}'", id);
        try (Connection conn = ConectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindBId(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) return Optional.empty();
            return Optional.of(Producer
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());

        } catch (SQLException e) {
            log.error("Error while trying to find all insert producer", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPreparedStatementFindBId(Connection conn, Integer id) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }




    public static void delet(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = ?);";
        try (Connection conn = ConectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindByName(conn, id);) {
            ps.execute();
            log.info("Deleted producer '{}' from the database '{}' ", id);

        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", id, e);
        }
    }


    private static PreparedStatement createPreparedStatementFindByName(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Producer producer) {
        log.info("Saving Producers  '{}'", producer);

        try (Connection conn = ConectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementSave(conn, producer);) {
            ps.execute();

        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getId(), e);
        }
    }


    private static PreparedStatement createPrepareStatementSave(Connection conn, Producer producer) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }


    public static void update(Producer producer){
        log.info("Updating producer '{}'",producer);
        try(Connection conn = ConectionFactory.getConnection();
            PreparedStatement ps = createPreparedStstementUpdate(conn,producer);){
            ps.execute();

        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'",producer.getId(),e);
        }
    }


    private static PreparedStatement createPreparedStstementUpdate(Connection conn,Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1,producer.getName());
        preparedStatement.setInt(2,producer.getId());
        return preparedStatement;
    }
}
