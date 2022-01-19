package OkulYonetimSistemi;
import OkulYonetimSistemi.OkulUyesi;
import java.util.*;

/**
 * @author sedat
 *
 */
public class OkulYonetimSistemi 
{
	public static void main(String[] args)
	{
		Scanner girdi = new Scanner(System.in);
		
		ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
		ArrayList<Ogretmen> ogretmenler = new ArrayList<Ogretmen>();
		ArrayList<Personel> personeller = new ArrayList<Personel>();
		
		while(true)
		{
			System.out.println("\nOKUL YONETIM SISTEMINE HOSGELDINIZ\n");
			System.out.println("Ogrenci icin 1 e bas�n");
			System.out.println("Ogretmen icin 2 ye bas�n");
			System.out.println("Personel icin 3 e bas�n");
			System.out.println("Sistem ��kmak icin 0 a bas�n");
			
			int sayi = girdi.nextInt();
			if(sayi == 0)
			{
				break;
			}
			if(sayi == 1)
			{
				while(true)
				{
					System.out.println("\nOGRENCI PANELI\n");
					System.out.println("Ogrencileri listelemek i�in 1 e bas�n");
					System.out.println("Ogrenci eklemek i�in 2 ye bas�n");
					System.out.println("Ogrenci silmek i�in 3 ye bas�n");
					System.out.println("Ogrenci se�mek i�in 4 e bas�n");
					System.out.println("Bir �st men� i�in 0 a bas�n");
					int sayi2 = girdi.nextInt();	
					
					if(sayi2 == 0)
					{
						break;
					}
					if(sayi2 == 1)
					{
						for(int i = 0; i < ogrenciler.size(); i++)
						{
							System.out.println("Okul ID : " + ogrenciler.get(i).getOkulID() + " �sim : " + 
									ogrenciler.get(i).getIsim() + " Soyisim : " + ogrenciler.get(i).getSoyisim());
						}
					}
					else if(sayi2 == 2)
					{
						System.out.println("Ogrenci i�in okul no giriniz : ");
						int okulNo = girdi.nextInt();
						System.out.println("Ogrenci i�in isim giriniz : "); girdi.nextLine();
						String isim = girdi.nextLine();
						System.out.println("Ogrenci i�in soyisim giriniz : ");
						String soyisim = girdi.nextLine();
						System.out.println("Ogrenci i�in ogretim giriniz : ");
						String ogretim = girdi.nextLine();

						Ogrenci yeniOgrenci = new Ogrenci(okulNo, isim, soyisim, ogretim);
						ogrenciler.add(yeniOgrenci);
						
						System.out.print("\nYeni ogrenci basar�yla eklendi");
					}
					else if(sayi2 == 3)
					{
						System.out.print("\nSilmek istediginiz ogrenci i�in okul no giriniz : ");
						int okulNo = girdi.nextInt();
						
						for(int i = 0; i < ogrenciler.size(); i++)
						{
							if(okulNo == ogrenciler.get(i).getOkulID())
							{
								ogrenciler.remove(i);
							}
						}
					}
					else if(sayi2 == 4)
					{
						System.out.print("\nSe�mek istediginiz ogrenci i�in okul no giriniz : ");
						int okulNo = girdi.nextInt();
						
						for(int i = 0; i < ogrenciler.size(); i++)
						{
							if(okulNo == ogrenciler.get(i).getOkulID())
							{
								while(true)
								{
									System.out.println(okulNo + " Nolu ogrenci se�ildi...\n");
									System.out.println("Ogrencinin derslerini listelemek i�in 1 e bas�n");
									System.out.println("Ogrenciye bir ders eklemek i�in 2 ye bas�n");
									System.out.println("Ogrenciden bir silmek i�in 3 ye bas�n");
									System.out.println("Ogrencinin y�ll�k izinlerini g�rmek i�in 4 e bas�n");
									System.out.println("Ogrencinin y�ll�k izinlerini degistirmek i�in 5 e bas�n");
									System.out.println("Bir �st men� i�in 0 a bas�n");
									int sayi3 = girdi.nextInt();
									
									if(sayi3 == 0)
									{
										break;
									}
									if(sayi3 == 1)
									{
										ogrenciler.get(i).DersListele();
									}
									if(sayi3 == 2)
									{
										System.out.println("Eklemek istediginiz dersin ad�n� giriniz : "); girdi.nextLine();
										String ders = girdi.nextLine();
										ogrenciler.get(i).DersEkle(ders);	
									}
									if(sayi3 == 3)
									{
										System.out.println("Silmek istediginiz dersin ad�n� giriniz : "); girdi.nextLine();
										String ders = girdi.nextLine();
										ogrenciler.get(i).DersSil(ders);
									}
									if(sayi3 == 4)
									{
										System.out.println("Y�ll�k izin say�s� : " + ogrenciler.get(i).getY�ll�k�zinSayisi());
									}
									if(sayi3 == 5)
									{
										System.out.println("Y�ll�k izin say�s� giriniz : ");
										int yilikizin = girdi.nextInt();
										ogrenciler.get(i).setY�ll�k�zinSayisi(yilikizin);
									}
								}
							}
						}
					}
				}

			}
			else if(sayi == 2)
			{
				while(true)
				{
					System.out.println("\nOGRETMEN PANELI\n");
					System.out.println("Ogretmenleri listelemek i�in 1 e bas�n");
					System.out.println("Ogretmen eklemek i�in 2 ye bas�n");
					System.out.println("Ogretmen silmek i�in 3 ye bas�n");
					System.out.println("Ogretmen se�mek i�in 4 e bas�n");
					System.out.println("Bir �st men� i�in 0 a bas�n");
					int sayi2 = girdi.nextInt();	
					
					if(sayi2 == 0)
					{
						break;
					}
					if(sayi2 == 1)
					{
						for(int i = 0; i < ogretmenler.size(); i++)
						{
							System.out.println("Okul ID : " + ogretmenler.get(i).getOkulID() + " �sim : " + 
									ogretmenler.get(i).getIsim() + " Soyisim : " + ogretmenler.get(i).getSoyisim());
						}
					}
					else if(sayi2 == 2)
					{
						System.out.println("Ogretmen i�in okul no giriniz : ");
						int okulNo = girdi.nextInt();
						System.out.println("Ogretmen i�in isim giriniz : "); girdi.nextLine();
						String isim = girdi.nextLine();
						System.out.println("Ogretmen i�in soyisim giriniz : ");
						String soyisim = girdi.nextLine();
						System.out.println("Ogretmen i�in alan giriniz : ");
						String alan = girdi.nextLine();
						System.out.println("Ogretmen i�in unvan giriniz : ");
						String unvan = girdi.nextLine();
						
						Ogretmen yeniOgretmen = new Ogretmen(okulNo, isim, soyisim, alan, unvan);
						ogretmenler.add(yeniOgretmen);
						
						System.out.print("\nYeni ogretmen basar�yla eklendi");
					}
					else if(sayi2 == 3)
					{
						System.out.print("\nSilmek istediginiz ogretmen i�in okul no giriniz : ");
						int okulNo = girdi.nextInt();
						
						for(int i = 0; i < ogretmenler.size(); i++)
						{
							if(okulNo == ogretmenler.get(i).getOkulID())
							{
								ogretmenler.remove(i);
							}
						}
					}
					else if(sayi2 == 4)
					{
						System.out.print("\nSe�mek istediginiz ogretmen i�in okul no giriniz : ");
						int okulNo = girdi.nextInt();
						
						for(int i = 0; i < ogretmenler.size(); i++)
						{
							if(okulNo == ogretmenler.get(i).getOkulID())
							{
								while(true)
								{
									System.out.println(okulNo + " Nolu ogretmen se�ildi...\n");
									System.out.println("Ogretmenin ders verdi�i s�n�flar� listelemek i�in 1 e bas�n");
									System.out.println("Ogretmene bir s�n�f eklemek i�in 2 ye bas�n");
									System.out.println("Ogretmenden bir s�n�f silmek i�in 3 ye bas�n");
									System.out.println("Ogretmenin y�ll�k izinlerini g�rmek i�in 4 e bas�n");
									System.out.println("Ogretmenin y�ll�k izinlerini degistirmek i�in 5 e bas�n");
									System.out.println("Bir �st men� i�in 0 a bas�n");
									int sayi3 = girdi.nextInt();
									
									if(sayi3 == 0)
									{
										break;
									}
									if(sayi3 == 1)
									{
										ogretmenler.get(i).SinifListele();
									}
									if(sayi3 == 2)
									{
										System.out.println("Eklemek istediginiz s�n�f�n ad�n� giriniz : "); girdi.nextLine();
										String sinif = girdi.nextLine();
										ogretmenler.get(i).SinifEkle(sinif);
									}
									if(sayi3 == 3)
									{
										System.out.println("Silmek istediginiz s�n�f�n ad�n� giriniz : "); girdi.nextLine();
										String sinif = girdi.nextLine();
										ogretmenler.get(i).SinifSil(sinif);
									}
									if(sayi3 == 4)
									{
										System.out.println("Y�ll�k izin say�s� : " + ogretmenler.get(i).getY�ll�k�zinSayisi());
									}
									if(sayi3 == 5)
									{
										System.out.println("Y�ll�k izin say�s� giriniz : ");
										int yilikizin = girdi.nextInt();
										ogretmenler.get(i).setY�ll�k�zinSayisi(yilikizin);
									}
								}
							}
						}
					}
				}
			}
			else if(sayi == 3)
			{
				while(true)
				{
					System.out.println("\nPERSONEL PANELI\n");
					System.out.println("Personelleri listelemek i�in 1 e bas�n");
					System.out.println("Personel eklemek i�in 2 ye bas�n");
					System.out.println("Personel silmek i�in 3 ye bas�n");
					System.out.println("Personel se�mek i�in 4 e bas�n");
					System.out.println("Bir �st men� i�in 0 a bas�n");
					int sayi2 = girdi.nextInt();	
					
					if(sayi2 == 0)
					{
						break;
					}
					if(sayi2 == 1)
					{
						for(int i = 0; i < personeller.size(); i++)
						{
							System.out.println("Okul ID : " + personeller.get(i).getOkulID() + " �sim : " + 
									personeller.get(i).getIsim() + " Soyisim : " + personeller.get(i).getSoyisim());
						}
					}
					else if(sayi2 == 2)
					{
						System.out.println("Personel i�in okul no giriniz : ");
						int okulNo = girdi.nextInt();
						System.out.println("Personel i�in isim giriniz : "); girdi.nextLine();
						String isim = girdi.nextLine();
						System.out.println("Personel i�in soyisim giriniz : ");
						String soyisim = girdi.nextLine();
						System.out.println("Personel i�in meslek giriniz : ");
						String meslek = girdi.nextLine();

						Personel yeniPersoneller = new Personel(okulNo, isim, soyisim, meslek);
						personeller.add(yeniPersoneller);
						
						System.out.print("\nYeni personel basar�yla eklendi");
					}
					else if(sayi2 == 3)
					{
						System.out.print("\nSilmek istediginiz personel i�in okul no giriniz : ");
						int okulNo = girdi.nextInt();
						
						for(int i = 0; i < personeller.size(); i++)
						{
							if(okulNo == personeller.get(i).getOkulID())
							{
								personeller.remove(i);
							}
						}
					}
					else if(sayi2 == 4)
					{
						System.out.print("\nSe�mek istediginiz personel i�in okul no giriniz : ");
						int okulNo = girdi.nextInt();
						
						for(int i = 0; i < personeller.size(); i++)
						{
							if(okulNo == personeller.get(i).getOkulID())
							{
								while(true)
								{
									System.out.println(okulNo + " Nolu personel se�ildi...\n");
									System.out.println("Personelin calistigi b�lgeleri listelemek i�in 1 e bas�n");
									System.out.println("Personele bir calisma bolgesi eklemek i�in 2 ye bas�n");
									System.out.println("Personelden bir calisma bolgesi silmek i�in 3 ye bas�n");
									System.out.println("Personelin y�ll�k izinlerini g�rmek i�in 4 e bas�n");
									System.out.println("Personelin y�ll�k izinlerini degistirmek i�in 5 e bas�n");
									System.out.println("Bir �st men� i�in 0 a bas�n");
									int sayi3 = girdi.nextInt();
									
									if(sayi3 == 0)
									{
										break;
									}
									if(sayi3 == 1)
									{
										personeller.get(i).BolgeListele();
									}
									if(sayi3 == 2)
									{
										System.out.println("Eklemek istediginiz bolgenin ad�n� giriniz : "); girdi.nextLine();
										String bolge = girdi.nextLine();
										personeller.get(i).BolgeEkle(bolge);
									}
									if(sayi3 == 3)
									{
										System.out.println("Silmek istediginiz bolgenin ad�n� giriniz : "); girdi.nextLine();
										String bolge = girdi.nextLine();
										personeller.get(i).BolgeSil(bolge);
									}
									if(sayi3 == 4)
									{
										System.out.println("Y�ll�k izin say�s� : " + personeller.get(i).getY�ll�k�zinSayisi());
									}
									if(sayi3 == 5)
									{
										System.out.println("Y�ll�k izin say�s� giriniz : ");
										int yilikizin = girdi.nextInt();
										personeller.get(i).setY�ll�k�zinSayisi(yilikizin);
									}
								}
							}
						}
					}
				}
			}
			else
			{
				System.out.println("Hatal� giri� yapt�n�z");
			}
		}
		System.out.println("\nSISTEMDEN CIKIS YAPILDI\n");
	}
}