package business;

import data.CaptainDataMock;
import model.Captain;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CaptainBusinessImpl implements CaptainBusiness{

    List<Captain> captains = CaptainDataMock.getList();

    @Override
    public Optional<Captain> get(String name) {
        return captains.stream()
                .filter(captain -> Objects.equals(captain.getName(), name))
                .findFirst();
    }

    @Override
    public List<Captain> getList() {
        return captains;
    }
}
