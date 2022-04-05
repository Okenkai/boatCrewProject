package business;

import data.SeamanDataMock;
import data.ViceCaptainDataMock;
import model.Seaman;
import model.ViceCaptain;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ViceCaptainBusinessImpl implements ViceCaptainBusiness{
    List<ViceCaptain> viceCaptains = ViceCaptainDataMock.getList();
    @Override
    public Optional<ViceCaptain> get(String name) {
        return viceCaptains.stream()
                .filter(seaman -> Objects.equals(seaman.getName(), name))
                .findFirst();
    }

    @Override
    public List<ViceCaptain> getList() {
        return viceCaptains;
    }
}
