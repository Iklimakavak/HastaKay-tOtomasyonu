
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class hasta_islem {
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement=null;
    
     public ArrayList<hst> hastalariGetir(){
         ArrayList<hst> cikti=new ArrayList<hst>();
        try {
            statement = con.createStatement();
            String sorgu="Select * From kayıt";
            ResultSet rs=statement.executeQuery(sorgu);
            
            while(rs.next()){
                int sıra= rs.getInt("sıra");
                String ad=rs.getString("ad");
                String soyad=rs.getString("soyad");
                String yasi=rs.getString("yas");
                String test_sonucu=rs.getString("test_sonucu");
                String durumu=rs.getString("durumu");
                cikti.add(new hst(sıra, ad, soyad, yasi, test_sonucu, durumu));
            }
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(hasta_islem.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
         
     }
      public void hastaSil(int sıra){
        
        String silme_sorgusu = "DELETE FROM kayıt where sıra = ?";
        
        try {
            preparedStatement = con.prepareStatement(silme_sorgusu);
            
            preparedStatement.setInt(1, sıra);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(hasta_islem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
     
       public void hastaGuncelle(int sıra, String yeni_ad,String yeni_soyad,String yeni_yasi,String yeni_test_sonucu,String yeni_durumu){
        
        String guncelleyen_sorgu = "UPDATE kayıt set ad = ?, soyad = ?, yasi = ?,test_sonucu, durumu = ?, ";
        
        try {
            preparedStatement = con.prepareStatement(guncelleyen_sorgu);
            
            preparedStatement.setString(1, yeni_ad);
            preparedStatement.setString(2, yeni_soyad);
            preparedStatement.setString(3, yeni_yasi);
            preparedStatement.setString(4, yeni_test_sonucu);
            preparedStatement.setString(5, yeni_durumu);
            preparedStatement.setInt(6, sıra);  
            preparedStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(hasta_islem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
     
     
     
     public void hastaEkle(String ad, String soyad, String yasi, String test_sonucu, String durumu){
          String ekleme = "Insert INTO kayıt (ad,soyad,yasi,test_sonucu,durumu) VALUES (?,?,?,?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(ekleme);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, yasi);
            preparedStatement.setString(4, test_sonucu);
            preparedStatement.setString(5, durumu);
            preparedStatement.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(hasta_islem.class.getName()).log(Level.SEVERE, null, ex);
        }
            
         
         
     }
     
    public boolean girisYap(String kul_adi,String parola){
        
        String sorgu= "Select * from admin where username =? and password=?";
        try {
            preparedStatement =con.prepareStatement(sorgu);
            preparedStatement.setString(1, kul_adi);
            preparedStatement.setString(2, parola);
            
            ResultSet rs=preparedStatement.executeQuery();
            
           if (rs.next()== false) {
                return false;
            }
            else return true;
         
          
            
        } catch (SQLException ex) {
            Logger.getLogger(hasta_islem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }
    
    
    
    public hasta_islem(){
        String url = "jdbc:mysql://" + data.host + ":" + data.port + "/" + data.db_ismi+ "?useTimezone=true&serverTimezone=UTC";
         try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        
        
        try {
            con = DriverManager.getConnection(url, data.kul_adi, data.parola);
            System.out.println("Bağlantı Başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
        }
    }
}
    