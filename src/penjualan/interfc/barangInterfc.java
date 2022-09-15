package penjualan.interfc;
import penjualan.entity.barang;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author kompu
 */
public interface barangInterfc {
    barang insert(barang o) throws SQLException;
    void update (barang o) throws SQLException;
    void delete (String kode_barang) throws SQLException;
    List getAll() throws SQLException;
}
