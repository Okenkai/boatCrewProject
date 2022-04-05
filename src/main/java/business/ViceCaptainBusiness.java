package business;

import model.ViceCaptain;

import java.util.List;
import java.util.Optional;

public interface ViceCaptainBusiness {
    /**
     * Get Vice Captain by id
     *
     * @param name Vice Captain Name
     * @return Vice Captain find by Name
     */
    Optional<ViceCaptain> get(String name);

    /**
     * Get Vice Captain list
     *
     * @return list of Vice Captains
     */
    List<ViceCaptain> getList();
}
