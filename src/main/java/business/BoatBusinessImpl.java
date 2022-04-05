package business;

import data.BoatDataMock;
import model.Boat;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class BoatBusinessImpl implements BoatBusiness {

    List<Boat> Boats = BoatDataMock.getList();

    /**
     * Get Boat by id
     *
     * @param name Boat Name
     * @return Boat find by Name
     */
    @Override
    public Optional<Boat> get(String name) {
        return Boats.stream()
                .filter(captain -> Objects.equals(captain.getName(), name))
                .findFirst();
    }

    /**
     * Get Boat list
     *
     * @return list of Boats
     */
    @Override
    public List<Boat> getList() {
        return Boats;
    }
}
