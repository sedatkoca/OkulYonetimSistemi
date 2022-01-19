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
			System.out.println("Ogrenci icin 1 e basýn");
			System.out.println("Ogretmen icin 2 ye basýn");
			System.out.println("Personel icin 3 e basýn");
			System.out.println("Sistem çýkmak icin 0 a basýn");
			
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
					System.out.println("Ogrencileri listelemek için 1 e basýn");
					System.out.println("Ogrenci eklemek için 2 ye basýn");
					System.out.println("Ogrenci silmek için 3 ye basýn");
					System.out.println("Ogrenci seçmek için 4 e basýn");
					System.out.println("Bir üst menü için 0 a basýn");
					int sayi2 = girdi.nextInt();	
					
					if(sayi2 == 0)
					{
						break;
					}
					if(sayi2 == 1)
					{
						for(int i = 0; i < ogrenciler.size(); i++)
						{
							System.out.println("Okul ID : " + ogrenciler.get(i).getOkulID() + " Ýsim : " + 
									ogrenciler.get(i).getIsim() + " Soyisim : " + ogrenciler.get(i).getSoyisim());
						}
					}
					else if(sayi2 == 2)
					{
						System.out.println("Ogrenci için okul no giriniz : ");
						int okulNo = girdi.nextInt();
						System.out.println("Ogrenci için isim giriniz : "); girdi.nextLine();
						String isim = girdi.nextLine();
						System.out.println("Ogrenci için soyisim giriniz : ");
						String soyisim = girdi.nextLine();
						System.out.println("Ogrenci için ogretim giriniz : ");
						String ogretim = girdi.nextLine();

						Ogrenci yeniOgrenci = new Ogrenci(okulNo, isim, soyisim, ogretim);
						ogrenciler.add(yeniOgrenci);
						
						System.out.print("\nYeni ogrenci basarýyla eklendi");
					}
					else if(sayi2 == 3)
					{
						System.out.print("\nSilmek istediginiz ogrenci için okul no giriniz : ");
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
						System.out.print("\nSeçmek istediginiz ogrenci için okul no giriniz : ");
						int okulNo = girdi.nextInt();
						
						for(int i = 0; i < ogrenciler.size(); i++)
						{
							if(okulNo == ogrenciler.get(i).getOkulID())
							{
								while(true)
								{
									System.out.println(okulNo + " Nolu ogrenci seçildi...\n");
									System.out.println("Ogrencinin derslerini listelemek için 1 e basýn");
									System.out.println("Ogrenciye bir ders eklemek için 2 ye basýn");
									System.out.println("Ogrenciden bir silmek için 3 ye basýn");
									System.out.println("Ogrencinin yýllýk izinlerini görmek için 4 e basýn");
									System.out.println("Ogrencinin yýllýk izinlerini degistirmek için 5 e basýn");
									System.out.println("Bir üst menü için 0 a basýn");
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
										System.out.println("Eklemek istediginiz dersin adýný giriniz : "); girdi.nextLine();
										String ders = girdi.nextLine();
										ogrenciler.get(i).DersEkle(ders);	
									}
									if(sayi3 == 3)
									{
										System.out.println("Silmek istediginiz dersin adýný giriniz : "); girdi.nextLine();
										String ders = girdi.nextLine();
										ogrenciler.get(i).DersSil(ders);
									}
									if(sayi3 == 4)
									{
										System.out.println("Yýllýk izin sayýsý : " + ogrenciler.get(i).getYýllýkÝzinSayisi());
									}
									if(sayi3 == 5)
									{
										System.out.println("Yýllýk izin sayýsý giriniz : ");
										int yilikizin = girdi.nextInt();
										ogrenciler.get(i).setYýllýkÝzinSayisi(yilikizin);
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
					System.out.println("Ogretmenleri listelemek için 1 e basýn");
					System.out.println("Ogretmen eklemek için 2 ye basýn");
					System.out.println("Ogretmen silmek için 3 ye basýn");
					System.out.println("Ogretmen seçmek için 4 e basýn");
					System.out.println("Bir üst menü için 0 a basýn");
					int sayi2 = girdi.nextInt();	
					
					if(sayi2 == 0)
					{
						break;
					}
					if(sayi2 == 1)
					{
						for(int i = 0; i < ogretmenler.size(); i++)
						{
							System.out.println("Okul ID : " + ogretmenler.get(i).getOkulID() + " Ýsim : " + 
									ogretmenler.get(i).getIsim() + " Soyisim : " + ogretmenler.get(i).getSoyisim());
						}
					}
					else if(sayi2 == 2)
					{
						System.out.println("Ogretmen için okul no giriniz : ");
						int okulNo = girdi.nextInt();
						System.out.println("Ogretmen için isim giriniz : "); girdi.nextLine();
						String isim = girdi.nextLine();
						System.out.println("Ogretmen için soyisim giriniz : ");
						String soyisim = girdi.nextLine();
						System.out.println("Ogretmen için alan giriniz : ");
						String alan = girdi.nextLine();
						System.out.println("Ogretmen için unvan giriniz : ");
						String unvan = girdi.nextLine();
						
						Ogretmen yeniOgretmen = new Ogretmen(okulNo, isim, soyisim, alan, unvan);
						ogretmenler.add(yeniOgretmen);
						
						System.out.print("\nYeni ogretmen basarýyla eklendi");
					}
					else if(sayi2 == 3)
					{
						System.out.print("\nSilmek istediginiz ogretmen için okul no giriniz : ");
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
						System.out.print("\nSeçmek istediginiz ogretmen için okul no giriniz : ");
						int okulNo = girdi.nextInt();
						
						for(int i = 0; i < ogretmenler.size(); i++)
						{
							if(okulNo == ogretmenler.get(i).getOkulID())
							{
								while(true)
								{
									System.out.println(okulNo + " Nolu ogretmen seçildi...\n");
									System.out.println("Ogretmenin ders verdiði sýnýflarý listelemek için 1 e basýn");
									System.out.println("Ogretmene bir sýnýf eklemek için 2 ye basýn");
									System.out.println("Ogretmenden bir sýnýf silmek için 3 ye basýn");
									System.out.println("Ogretmenin yýllýk izinlerini görmek için 4 e basýn");
									System.out.println("Ogretmenin yýllýk izinlerini degistirmek için 5 e basýn");
									System.out.println("Bir üst menü için 0 a basýn");
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
										System.out.println("Eklemek istediginiz sýnýfýn adýný giriniz : "); girdi.nextLine();
										String sinif = girdi.nextLine();
										ogretmenler.get(i).SinifEkle(sinif);
									}
									if(sayi3 == 3)
									{
										System.out.println("Silmek istediginiz sýnýfýn adýný giriniz : "); girdi.nextLine();
										String sinif = girdi.nextLine();
										ogretmenler.get(i).SinifSil(sinif);
									}
									if(sayi3 == 4)
									{
										System.out.println("Yýllýk izin sayýsý : " + ogretmenler.get(i).getYýllýkÝzinSayisi());
									}
									if(sayi3 == 5)
									{
										System.out.println("Yýllýk izin sayýsý giriniz : ");
										int yilikizin = girdi.nextInt();
										ogretmenler.get(i).setYýllýkÝzinSayisi(yilikizin);
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
					System.out.println("Personelleri listelemek için 1 e basýn");
					System.out.println("Personel eklemek için 2 ye basýn");
					System.out.println("Personel silmek için 3 ye basýn");
					System.out.println("Personel seçmek için 4 e basýn");
					System.out.println("Bir üst menü için 0 a basýn");
					int sayi2 = girdi.nextInt();	
					
					if(sayi2 == 0)
					{
						break;
					}
					if(sayi2 == 1)
					{
						for(int i = 0; i < personeller.size(); i++)
						{
							System.out.println("Okul ID : " + personeller.get(i).getOkulID() + " Ýsim : " + 
									personeller.get(i).getIsim() + " Soyisim : " + personeller.get(i).getSoyisim());
						}
					}
					else if(sayi2 == 2)
					{
						System.out.println("Personel için okul no giriniz : ");
						int okulNo = girdi.nextInt();
						System.out.println("Personel için isim giriniz : "); girdi.nextLine();
						String isim = girdi.nextLine();
						System.out.println("Personel için soyisim giriniz : ");
						String soyisim = girdi.nextLine();
						System.out.println("Personel için meslek giriniz : ");
						String meslek = girdi.nextLine();

						Personel yeniPersoneller = new Personel(okulNo, isim, soyisim, meslek);
						personeller.add(yeniPersoneller);
						
						System.out.print("\nYeni personel basarýyla eklendi");
					}
					else if(sayi2 == 3)
					{
						System.out.print("\nSilmek istediginiz personel için okul no giriniz : ");
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
						System.out.print("\nSeçmek istediginiz personel için okul no giriniz : ");
						int okulNo = girdi.nextInt();
						
						for(int i = 0; i < personeller.size(); i++)
						{
							if(okulNo == personeller.get(i).getOkulID())
							{
								while(true)
								{
									System.out.println(okulNo + " Nolu personel seçildi...\n");
									System.out.println("Personelin calistigi bölgeleri listelemek için 1 e basýn");
									System.out.println("Personele bir calisma bolgesi eklemek için 2 ye basýn");
									System.out.println("Personelden bir calisma bolgesi silmek için 3 ye basýn");
									System.out.println("Personelin yýllýk izinlerini görmek için 4 e basýn");
									System.out.println("Personelin yýllýk izinlerini degistirmek için 5 e basýn");
									System.out.println("Bir üst menü için 0 a basýn");
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
										System.out.println("Eklemek istediginiz bolgenin adýný giriniz : "); girdi.nextLine();
										String bolge = girdi.nextLine();
										personeller.get(i).BolgeEkle(bolge);
									}
									if(sayi3 == 3)
									{
										System.out.println("Silmek istediginiz bolgenin adýný giriniz : "); girdi.nextLine();
										String bolge = girdi.nextLine();
										personeller.get(i).BolgeSil(bolge);
									}
									if(sayi3 == 4)
									{
										System.out.println("Yýllýk izin sayýsý : " + personeller.get(i).getYýllýkÝzinSayisi());
									}
									if(sayi3 == 5)
									{
										System.out.println("Yýllýk izin sayýsý giriniz : ");
										int yilikizin = girdi.nextInt();
										personeller.get(i).setYýllýkÝzinSayisi(yilikizin);
									}
								}
							}
						}
					}
				}
			}
			else
			{
				System.out.println("Hatalý giriþ yaptýnýz");
			}
		}
		System.out.println("\nSISTEMDEN CIKIS YAPILDI\n");
	}
}