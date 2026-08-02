package academy.devdojo.maratonajava.javacore.ZZJcrud.Repository;


import academy.devdojo.maratonajava.javacore.ZZJcrud.conn.ConectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Log4j2
public class AnimeRepository {

    public static List<Anime> findAnimeByName(String name) {
        log.info("Finding all Animes by name '{}'", name);
        List<Anime> animes = new ArrayList<>();
        try (Connection conn = ConectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("produces_id"))
                        .name(rs.getString("producer_name"))
                        .build();

                Anime anime = Anime
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();
                animes.add(anime);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all insert anime", e);
        }
        return animes;
    }


    private static PreparedStatement createPreparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = """
                SELECT a.id, a.nome, a.episodes, a.produces_id, p.name as 'producer_name' FROM anime_store.anime a inner join
                anime_store.producer p on a.produces_id = p.id
                where a.nome like ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }


    public static Optional<Anime> findById(Integer id) {
        log.info("Finding all Animes by id '{}'", id);
        try (Connection conn = ConectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindBId(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) return Optional.empty();
            Producer producer = Producer.builder()
                    .id(rs.getInt("produces_id"))
                    .name(rs.getString("producer_name"))
                    .build();

            Anime anime = Anime
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .episodes(rs.getInt("episodes"))
                    .producer(producer)
                    .build();
            return Optional.of(anime);

        } catch (SQLException e) {
            log.error("Error while trying to find all insert anime", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPreparedStatementFindBId(Connection conn, Integer id) throws SQLException {
        String sql = """
                SELECT a.id, a.nome, a.episodes, a.produces_id, p.name as 'producer_name' FROM anime_store.anime a inner join
                anime_store.producer p on a.produces_id = p.id
                where a.id = ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }


    public static void delet(int id) {
        String sql = "DELETE FROM `anime_store`.`anime` WHERE (`id` = ?);";
        try (Connection conn = ConectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindByName(conn, id);) {
            ps.execute();
            log.info("Deleted anime '{}' from the database '{}' ", id);

        } catch (SQLException e) {
            log.error("Error while trying to insert anime '{}'", id, e);
        }
    }


    private static PreparedStatement createPreparedStatementFindByName(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`anime` WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Anime anime) {
        log.info("Saving Animes  '{}'", anime);

        try (Connection conn = ConectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementSave(conn, anime);) {
            ps.execute();

        } catch (SQLException e) {
            log.error("Error while trying to insert anime '{}'", anime.getId(), e);
        }
    }


    private static PreparedStatement createPrepareStatementSave(Connection conn, Anime anime) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`anime` (`nome`, `episodes`, `produces_id`) VALUES (?,?,?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getProducer().getId());
        return ps;
    }


    public static void update(Anime anime) {
        log.info("Updating anime '{}'", anime);
        try (Connection conn = ConectionFactory.getConnection();
             PreparedStatement ps = createPreparedStstementUpdate(conn, anime);) {
            ps.execute();

        } catch (SQLException e) {
            log.error("Error while trying to insert anime '{}'", anime.getId(), e);
        }
    }


    private static PreparedStatement createPreparedStstementUpdate(Connection conn, Anime anime) throws SQLException {
        String sql = "UPDATE `anime_store`.`anime` SET `name` = ?, `episodes` = ?  WHERE (`id` = ?);";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, anime.getName());
        preparedStatement.setInt(2, anime.getEpisodes());
        preparedStatement.setInt(3, anime.getId());
        return preparedStatement;
    }
}
