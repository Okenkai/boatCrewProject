package business;

import model.Captain;

import java.util.List;
import java.util.Optional;

public interface CaptainBusiness {
    /**
     * Get Captain by id
     *
     * @param name Captain Name
     * @return Captain find by Name
     */
    Optional<Captain> get(String name);

    /**
     * Get Captain list
     *
     * @return list of Captains
     */
    List<Captain> getList();
}
