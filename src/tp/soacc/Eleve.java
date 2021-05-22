package tp.soacc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Eleve {
	
	String nom;
	String prenom;
	String adresse;
	String bac;
	Float moyenne;
	
	
	
	
	public Eleve() {
		
		// TODO Auto-generated constructor stub
	}




	public Eleve(String nom, String prenom, String adresse, String bac,Float moyenne) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.bac = bac;
		this.moyenne = moyenne;
	}




	public int getMoyen(String bac) {
		try {
			BD.connect("jdbc:postgresql://localhost:5434/tp_soacc","postgres","azerty");
			ResultSet rs = BD.execute("select * from public.eleve where bac ='"+bac+"'");
			while(rs.next()) {
				System.out.println(rs.getString("nom"));
				System.out.println(rs.getString("moyenne"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				BD.st.close();
				BD.cn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return 10;
	}

}