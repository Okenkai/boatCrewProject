package business;

import model.Seaman;

import java.util.List;
import java.util.Optional;

public interface SeamanBusiness {
    /**
     * Get Seaman by id
     *
     * @param name seaman Name
     * @return seaman find by Name
     */
    Optional<Seaman> get(String name);

    /**
     * Get Seaman list
     *
     * @return list of seamans
     */
    List<Seaman> getList();
}
