package OkulYonetimSistemi;

import java.util.ArrayList;

public class Ogrenci extends OkulUyesi
{
	private ArrayList<String> dersler = new ArrayList<String>();
	private String ogretim;
	
	public Ogrenci(int _OkulID, String _isim, String _soyisim, String _ogretim) //Constructor  OkulUyesi(123, Ali, Bilmemne);
	{
		super.OkulID = _OkulID;
		super.isim = _isim;
		super.soyisim = _soyisim;
		ogretim = _ogretim;
		setYıllıkİzinSayisi(14);
	}
	
	public int getOkulID()
	{
		return super.OkulID;
	}
	
	public void setOkulID(int _OkulID)
	{
		if(_OkulID > 0) // Öğrenci sayısı 1000
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
	
	public String getOgretim()
	{
		return ogretim;
	}
	
	public void setOgretim(String _ogretim)
	{
		ogretim = _ogretim;
	}

	public int getYıllıkİzinSayisi()
	{
		return yıllıkİzinSayisi;
	}
	
	public void setYıllıkİzinSayisi(int yıllıkİzin)
	{
		if(yıllıkİzin > 0 && yıllıkİzin <= 14)
		{
			super.yıllıkİzinSayisi = yıllıkİzin;
		}
		else
		{
			System.out.println("Hatalı set işlemi!");
		}
	}
	
	public void DersEkle(String ders)
	{
		dersler.add(ders);
	}
	
	public void DersListele()
	{
		System.out.println("Mevcut dersler : ");
		for (int i = 0; i < dersler.size(); i++) 
		{
		      System.out.println(dersler.get(i));
		}
		System.out.println("");

	}
	
	public void DersSil(String ders)
	{
		dersler.remove(ders);
		System.out.println(ders + " dersi silinmiştir.");
	}
}
