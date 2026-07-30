package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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
}
