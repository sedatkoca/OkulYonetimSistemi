package OkulYonetimSistemi;

public abstract class OkulUyesi 
{
	protected int OkulID;
	protected String isim; 
	protected String soyisim;
	protected int yıllıkİzinSayisi;

	protected abstract int getOkulID();
	protected abstract void setOkulID(int _OkulID);
	protected abstract String getIsim();
	protected abstract void setIsim(String _isim);
	protected abstract String getSoyisim();
	protected abstract void setSoyisim(String _soyisim);
	protected abstract int getYıllıkİzinSayisi();
	protected abstract void setYıllıkİzinSayisi(int yıllıkİzin);	
}
