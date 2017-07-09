package myhibernate;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by Developer on 6/28/2017.
 */
public interface BusDAO {
    public void addBus(Bus bus) throws SQLException;
    public void updateBus(Long bus_id, Bus bus) throws SQLException;
    public Bus getBusById(Long bus_id) throws SQLException;
    public Collection getAllBusses() throws SQLException;
    public void deleteBus(Bus bus) throws SQLException;
    public Collection getBussesByDriver(Driver driver) throws SQLException;
    public Collection getBussesByRoute(Route route) throws SQLException;

}