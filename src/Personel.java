package OkulYonetimSistemi;
import java.util.*;
public class Personel extends OkulUyesi
{
	private ArrayList<String> calisilanBolge = new ArrayList<String>();
	private String meslek;
	
	public Personel(int _OkulID, String _isim, String _soyisim, String _meslek) 
	{
		super.OkulID = _OkulID;
		super.isim = _isim;
		super.soyisim = _soyisim;
		meslek = _meslek;
	}
	
	public int getOkulID()
	{
		return super.OkulID;
	}
	
	public void setOkulID(int _OkulID)
	{
		if( _OkulID > 0)
		{
			super.OkulID = _OkulID;
		}
	}

	public String getIsim()
	{
		return super.isim;
	}
	
	public void setIsim(String _isim)
	{
		super.isim = _isim;
	}
	
	public String getSoyisim() 
	{
		return super.soyisim;
	}
	
	public void setSoyisim(String _soyisim)
	{
		super.soyisim = _soyisim;
	}
	
	public String getMeslek()
	{
		return meslek;
	}
	
	public void setMeslek(String _meslek)
	{
		meslek = _meslek;
	}

	public int getYýllýkÝzinSayisi()
	{
		return yýllýkÝzinSayisi;
	}
	
	public void setYýllýkÝzinSayisi(int yýllýkÝzin)
	{
		if(yýllýkÝzin > 0 && yýllýkÝzin <= 30)
		{
			super.yýllýkÝzinSayisi = yýllýkÝzin;
		}
		else
		{
			System.out.println("Hatalý set iþlemi!");
		}
	}
	
	public void BolgeEkle(String bolge)
	{
		calisilanBolge.add(bolge);
	}
	
	public void BolgeListele()
	{
		System.out.println("Mevcut bölgeler : ");
		for (int i = 0; i < calisilanBolge.size(); i++) 
		{
		      System.out.println(calisilanBolge.get(i));
		}
		System.out.println("");
	}
	
	public void BolgeSil(String bolge)
	{
		calisilanBolge.remove(bolge);
		System.out.println(bolge + " bölgesi silinmiþtir.");
	}
}