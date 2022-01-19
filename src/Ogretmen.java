package OkulYonetimSistemi;

import java.util.*;
public class Ogretmen extends OkulUyesi
{
	private ArrayList<String> dersVerilenSiniflar = new ArrayList<String>();
	private String alan;
	private String unvan;
	
	public Ogretmen(int _OkulID, String _isim, String _soyisim, String _alan, String _unvan) 
	{
		super.OkulID = _OkulID;
		super.isim = _isim;
		super.soyisim = _soyisim;
		alan = _alan;
		unvan = _unvan;
		setY�ll�k�zinSayisi(30);
	}
	
	public int getOkulID()
	{
		return super.OkulID;
	}
	
	public void setOkulID(int _OkulID)
	{
		if(_OkulID > 0) // ��retmen say�s� 50
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
	
	public String getAlan()
	{
		return alan;
	}
	
	public void setAlan(String _alan)
	{
		alan = _alan;
	}
	
	public String getUnvan()
	{
		return unvan;
	}
	
	public void setUnvan(String _unvan)
	{
		unvan = _unvan;
	}	
	
	public int getY�ll�k�zinSayisi()
	{
		return y�ll�k�zinSayisi;
	}
	
	public void setY�ll�k�zinSayisi(int y�ll�k�zin)
	{
		if(y�ll�k�zin > 0 && y�ll�k�zin <= 30)
		{
			super.y�ll�k�zinSayisi = y�ll�k�zin;
		}
		else
		{
			System.out.println("Hatal� set i�lemi!");
		}
	}
	
	public void SinifEkle(String sinif)
	{
		dersVerilenSiniflar.add(sinif);
	}
	
	public void SinifListele()
	{
		System.out.println("Mevcut s�n�flar : ");
		for (int i = 0; i < dersVerilenSiniflar.size(); i++) 
		{
		      System.out.println(dersVerilenSiniflar.get(i));
		}
		System.out.println("");

	}
	
	public void SinifSil(String sinif)
	{
		dersVerilenSiniflar.remove(sinif);
		System.out.println(sinif + " s�n�f� silinmi�tir.");
	}
}
