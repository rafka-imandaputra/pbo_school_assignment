package penjualan.implement;
import com.mysql.jdbc.Connection;
import penjualan.koneksi.koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author kompu
 */
public class transaksiImplement {
        public int urutanDb(){
            Connection con = (Connection) koneksi.getConnection();
            int jml = 0;
            try{
                String sql = "SELECT count (*) AS urutan FROM penjualan";
                Statement rs = (Statement) con.createStatement();
                ResultSet count = rs.executeQuery(sql);
                while (count.next()) {
                    jml = count.getInt("urutan");
                }
                rs.close();
                count.close();
            }  catch (Exception e){
                e.printStackTrace();
            }
            return ++jml;
        }
        
        public ArrayList<String> viewKdBrg() throw SQLException{
            ArrayList<String> viewNamaBrg = new ArrayList();
            try{
                Statement kt = koneksi.getConnection().createStatement();
                ResultSet rsKb = kt.executeQuery("SELECT kode_barang.nama_barang FROM barang");
                while (rsKb.next()){
                    viewNamaBrg.add(rsKb.getString("kode_barang") + "-" + (rsKb.getString("nama_barang")));
                }
            } catch (Exception e){
                e.printStackTrace();
            }
            return viewNamaBrg;
        }
        
        public ArrayList<String> viewIdBrg() throw SQLException{
            ArrayList<String> viewNamaPlg = new ArrayList();
            try{
                Statement kt = koneksi.getConnection().createStatement();
                ResultSet rsKb = kt.executeQuery("SELECT id_pelanggan, nama FROM pelangan");
                while (rsKb.next()){
                    viewNamaPlg.add(rsKb.getString("id_pelanggan") + "-" + (rsKb.getString("nama")));
                }
            } catch (Exception e){
                e.printStackTrace();
            }
            return viewNamaPlg;
        }
        
        
}
