package penjualan.entity; 
public class pelanggan{
    private int id_pelanggan; 
    private String nama; 
    private String jeniskel; 
    private String alamat; 
    private String notlp; 
    String idpel = String.valueOf(id_pelanggan);
    
    public String getIdPelanggan(){ 
        return idpel; 
    } 
    public void setIdPelanggan(String idpel){ 
        this.idpel = idpel; 
    } 
    public String getNama(){ 
        return nama; 
    }
    public void setNama(String nama){ 
        this.nama = nama; 
    } 
    public String getJeniskel(){
        return jeniskel; 
    } 
    public void setJeniskel (String jeniskel){ 
        this.jeniskel = jeniskel; 
    } 
    public String getAlamat(){ 
        return alamat; 
    } 
    public void setAlamat(String alamat){ 
        this.alamat = alamat; 
    } 
    public String getNotlp(){
            return notlp; 
    } 
    public void setNotlp(String notlp){ 
        this.notlp = notlp; 
        }
}

