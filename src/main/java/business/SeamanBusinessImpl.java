package business;

import data.SeamanDataMock;
import model.Boat;
import model.Seaman;
import model.ViceCaptain;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class SeamanBusinessImpl implements SeamanBusiness {

    List<Seaman> seamanList = SeamanDataMock.getList();

    @Override
    public Optional<Seaman> get(String name) {
        return seamanList.stream()
                .filter(seaman -> Objects.equals(seaman.getName(), name))
                .findFirst();
    }

    @Override
    public List<Seaman> getList() {
        return seamanList;
    }
}
