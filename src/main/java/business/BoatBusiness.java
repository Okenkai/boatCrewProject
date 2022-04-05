package business;

import model.Boat;

import java.util.List;
import java.util.Optional;

public interface BoatBusiness {
    /**
     * Get Boat by id
     *
     * @param name Boat Name
     * @return Boat find by Name
     */
    Optional<Boat> get(String name);

    /**
     * Get Boat list
     *
     * @return list of Boats
     */
    List<Boat> getList();
}
