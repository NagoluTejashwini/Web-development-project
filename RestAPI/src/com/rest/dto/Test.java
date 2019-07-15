package com.rest.dto;
import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.internal.util.xml.XmlDocument;

import java.util.*;

public class Test
{
	public static void main(String args[])
	{
		Configuration cfg=new AnnotationConfiguration();

		cfg=cfg.configure("hibernate.cfg.xml");

		SessionFactory factory=cfg.buildSessionFactory();

		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		/*City city1 =new City();
		city1.setCityId(new Integer(101));
		city1.setCityName("Mumbai");
		
		TouristPlaces touristPlace1 = new TouristPlaces();
		touristPlace1.setPlaceId(1);
		touristPlace1.setPlaceName("Gateway Of India Mumbai");
		touristPlace1.setAddress(" Apollo Bandar, Colaba, Mumbai, Maharashtra 400001");
		touristPlace1.setDescription("The Gateway of India is an arch monument built during the 20th century in Mumbai, India. The monument was erected to commemorate the landing of King-Emperor George V and Queen-Empress Mary at Apollo Bunder on their visit to India in 1911. ");
		touristPlace1.setTimings("12:00am - 11:59pm");
		
		TouristPlaces  touristPlace2 = new TouristPlaces ();
		touristPlace2.setPlaceId(2);
		touristPlace2.setPlaceName("Elephanta Caves");
		touristPlace2.setAddress(" Gharapuri, Maharashtra 400094");
		touristPlace2.setDescription("Elephanta Caves are a UNESCO World Heritage Site and a collection of cave temples predominantly dedicated to the Hindu god Shiva. They are located on Elephanta Island, or Gharapuri in Mumbai Harbour, 10 kilometres to the east of the city of Mumbai in the Indian state of Mahārāshtra. ");
		touristPlace2.setTimings("9:30am - 5:30pm");
		
		
		TouristPlaces  touristPlace3 = new TouristPlaces ();
		touristPlace3.setPlaceId(3);
		touristPlace3.setPlaceName("Marine Drive");
		touristPlace3.setAddress("Mumbai");
		touristPlace3.setDescription("Marine Drive is a 3.6-kilometre-long Boulevard in South Mumbai in the city of Mumbai, India. The road was constructed by late philanthropist Bhagojisheth Keer & Pallonji Mistry. It is a 'C'-shaped six-lane concrete road along the coast, which is a natural bay.");
		touristPlace3.setTimings("9:00am - 5:30pm");
		
		TouristPlaces  touristPlace4 = new TouristPlaces ();
		touristPlace4.setPlaceId(4);
		touristPlace4.setPlaceName("Rajabai Clock Tower");
		touristPlace4.setAddress("Karmaveer Bhaurao Patil Marg, Mantralaya, Fort, Mumbai, Maharashtra 400032");
		touristPlace4.setDescription("The Rajabai Clock Tower is a clock tower in South Mumbai India. It is located in the confines of the Fort campus of the University of Mumbai. It stands at a height of 85 m. The tower is part of The Victorian and Art Deco Ensemble of Mumbai, which was added to the list of World Heritage Sites in 2018.");
		touristPlace4.setTimings("9:00am- 10:45pm");
		
		TouristPlaces  touristPlace5 = new TouristPlaces ();
		touristPlace5.setPlaceId(5);
		touristPlace5.setPlaceName("Jehangir Art Gallery");
		touristPlace5.setAddress("161B, Mahatma Gandhi Road, Kala Ghoda, Fort, Mumbai, Maharashtra 400001");
		touristPlace5.setDescription("Jehangir Art Gallery is an art gallery in Mumbai. It was founded by Sir Cowasji Jehangir at the urging of K. K. Hebbar and Homi Bhabha. It was built in 1952. Managed by the Committee of Management, the entire cost of this mansion was donated by Cowasji Jehangir. ");
		touristPlace5.setTimings("11:00am - 7:00pm");
		
		List<TouristPlaces> touristPlace = new ArrayList<TouristPlaces>();
		touristPlace.add(touristPlace1);
		touristPlace.add(touristPlace2);
		touristPlace.add(touristPlace3);
		touristPlace.add(touristPlace4);
		touristPlace.add(touristPlace5);
		
		city1.getTouristPlaces().add(touristPlace1);
		city1.getTouristPlaces().add(touristPlace2);
		city1.getTouristPlaces().add(touristPlace3);
		city1.getTouristPlaces().add(touristPlace4);
		city1.getTouristPlaces().add(touristPlace5);
		
		touristPlace1.setCity(city1);
		touristPlace2.setCity(city1); 
		touristPlace3.setCity(city1); 
		touristPlace4.setCity(city1); 
		touristPlace5.setCity(city1); 
		

		Hotels hotel1 = new Hotels();
		hotel1.setHotelId(1);
		hotel1.setHotelName("The Orchid Hotel Mumbai Vile Parle");
		hotel1.setAddress("70-C, Nehru Road Near Mumbai Domestic Airport, Vile Parle East, Mumbai, Maharashtra 400099•022 2616 4000");
		hotel1.setDescription(" Bright, airy rooms & suites in an upscale hotel offering several restaurants & a rooftop pool.");
		hotel1.setRating(5);
		hotel1.setPhone("9452123456");
		
		
		Hotels  hotel2 = new Hotels ();
		hotel2.setHotelId(2);
		hotel2.setHotelName("The LaLiT Mumbai");
		hotel2.setAddress("Sahar Airport Rd, Navpada, Marol, Andheri East, Mumbai, Maharashtra 400059•022 6699 2222.");
		hotel2.setDescription("Upscale property with elegant quarters, warm dining & a pool, plus a spa, a gym & a screening room.");
		hotel2.setRating(5);
		hotel2.setPhone("9456789075");
		
		Hotels hotel3 = new Hotels();
		hotel3.setHotelId(3);
		hotel3.setHotelName("Ginger Mumbai, Andheri (MIDC)");
		hotel3.setAddress("Mahakali Caves Rd, Near Holy Spirit Hospital, Sunder Nagar, Andheri East, Mumbai, Maharashtra 400093•022 6666 6333");
		hotel3.setDescription("Unpretentious hotel offering a gym & a restaurant, plus complimentary Wi-Fi & parking.");
		hotel3.setRating(3);
		hotel3.setPhone("9567844313");
		
		Hotels  hotel4 = new Hotels ();
		hotel4.setHotelId(4);
		hotel4.setHotelName("Mogul Palace Hotel");
		hotel4.setAddress("20, Dontad Cross Lane, Off Yusuf Mehar Ali Road, Mumbai, Maharashtra 400009•022 2345 5656");
		hotel4.setDescription("Streamlined rooms in a casual hotel with a laid-back restaurant offering outdoor dining.");
		hotel4.setRating(3);
		hotel4.setPhone("9452345678");
		
		Hotels  hotel5 = new Hotels ();
		hotel5.setHotelId(5);
		hotel5.setHotelName("Urbanpod Hotel");
		hotel5.setAddress("Urban Pod Pvt. Ltd., OPUS PARK, PLOT F-21, FIRST FLOOR,, MIDC CENTRAL ROAD, Beside Seepz Bus Depot,, ANDHERI(EAST), Mumbai, Maharashtra 400093•074004 86116.");
		hotel5.setDescription("Minimalist pods in a sleek capsule hotel offering free hot breakfast & a bright cafe.");
		hotel5.setRating(4);
		hotel5.setPhone("8542544313");
		
		List<Hotels> hotels = new ArrayList<Hotels>();
		hotels.add(hotel1);
		hotels.add(hotel2);
		hotels.add(hotel3);
		hotels.add(hotel4);
		hotels.add(hotel5);
		
		city1.getHotels().add(hotel1);
		city1.getHotels().add(hotel2);
		city1.getHotels().add(hotel3);
		city1.getHotels().add(hotel4);
		city1.getHotels().add(hotel5);
		
		hotel1.setCity(city1);
		hotel2.setCity(city1);
		hotel3.setCity(city1);
		hotel4.setCity(city1); 
		hotel5.setCity(city1); 
		
		Restaurants restaurant1 = new Restaurants();
		restaurant1.setRestaurantId(1);
		restaurant1.setRestaurantName("Mirchi & Mime");
		restaurant1.setAddress("Trans Ocean House, Hiranandani Gardens, MHADA Colony 19, Powai, Mumbai, Maharashtra 400076");
		restaurant1.setDescription("Hearing and speech-impaired wait staff serve imaginative takes on classic Indian cuisine.");
		restaurant1.setRating(4.5);
		restaurant1.setPhone("9452744313");
		
		
		Restaurants  restaurant2 = new Restaurants();
		restaurant2.setRestaurantId(2);
		restaurant2.setRestaurantName("Yauatcha Mumbai");
		restaurant2.setAddress("Raheja Tower, Bandra Kurla Complex, G Block BKC, Bandra Kurla Complex, Bandra East, Mumbai, Maharashtra 400051");
		restaurant2.setDescription("If you are around BKC area, don't miss Yauatcha restaurant. Excellent and delicious Asian food. We had the honor to have Gagan as a waiter, professional service and delicious dishes recommendation. Thank you Gagan for lovely evening.");
		restaurant2.setRating(4.5);
		restaurant2.setPhone("9452744323");
		
		Restaurants  restaurant3 = new Restaurants();
		restaurant3.setRestaurantId(3);
		restaurant3.setRestaurantName("By the Mekong");
		restaurant3.setAddress("Level 32, The St. Regis Mumbai, 462, Tulsi Pipe Rd, Lower Parel, Mumbai, Maharashtra 400013");
		restaurant3.setDescription("Towering luxury hotel's elegant city view pan Asian restaurant on the 37th floor.");
		restaurant3.setRating(4.4);
		restaurant3.setPhone("9452744456");
		
		Restaurants  restaurant4 = new Restaurants();
		restaurant4.setRestaurantId(4);
		restaurant4.setRestaurantName("Shree Thaker Bhojanalay (Since 1945 )");
		restaurant4.setAddress("Building No, 31, Dadiseth Agiyari Ln, Kalbadevi, Mumbai, Maharashtra 400002");
		restaurant4.setDescription("Long-running, laid-back thali restaurant offering a selection of traditional Indian fare.");
		restaurant4.setRating(4.5);
		restaurant4.setPhone("9452744567");
		
		Restaurants  restaurant5 = new Restaurants();
		restaurant5.setRestaurantId(5);
		restaurant5.setRestaurantName("Celini");
		restaurant5.setAddress("BKC Vicinity, Off Western Express Highway, Santacruz East, Mumbai, Maharashtra 400055");
		restaurant5.setDescription("Italian classics and a vast array of wines offered in an upscale, modern setting at the Grand Hyatt.");
		restaurant5.setRating(4.4);
		restaurant5.setPhone("9452778907");
		
		List<Restaurants> restaurants=new ArrayList<Restaurants>();
		restaurants.add(restaurant1);
		restaurants.add(restaurant2);
		restaurants.add(restaurant3);
		restaurants.add(restaurant4);
		restaurants.add(restaurant5);
		
		city1.getRestaurants().add(restaurant1);
		city1.getRestaurants().add(restaurant2);
		city1.getRestaurants().add(restaurant3);
		city1.getRestaurants().add(restaurant4);
		city1.getRestaurants().add(restaurant5);
		
		restaurant1.setCity(city1);
		restaurant2.setCity(city1); 
		restaurant3.setCity(city1); 
		restaurant4.setCity(city1); 
		restaurant5.setCity(city1); 
		
		
		
		
		Malls  mall1 = new Malls ();
		mall1.setMallId(1);
		mall1.setMallName("High Street Phoenix");
		mall1.setAddress("462, Tulsi Pipe Rd, Lower Parel, Mumbai, Maharashtra 400013");
		mall1.setDescription("High Street Phoenix, formerly known as Phoenix Mall, is one of the largest shopping malls in India, situated in Lower Parel, Mumbai. Its gross floor area is 3,300,000 square feet. ");
		
		
		Malls   mall2 = new Malls ();
		mall2.setMallId(2);
		mall2.setMallName("Phoenix Marketcity");
		mall2.setAddress("LBS Rd, Kamani, Kurla West, Kurla, Mumbai, Maharashtra 400070");
		mall2.setDescription("Phoenix Marketcity is the largest shopping mall in Mumbai, situated in Kurla, Mumbai. It is developed by The Phoenix Mills Co. Ltd. ");
		
		
		Malls  mall3 = new Malls ();
		mall3.setMallId(3);
		mall3.setMallName("Oberoi Mall ");
		mall3.setAddress(" Western Express Hwy, Yashodham, Goregaon, Mumbai, Maharashtra 400063");
		mall3.setDescription("Good place with parking facility all brands available, Food Court with Multiplex.");
		
		
		Malls   mall4 = new Malls ();
		mall4.setMallId(4);
		mall4.setMallName("Infiniti Mall");
		mall4.setAddress(" New Link Rd, Phase D, Oshiwara, Andheri West, Mumbai, Maharashtra 400053");
		mall4.setDescription("Infiniti Mall is a chain of shopping malls in India. It is a subsidiary of K.");
		
		Malls  mall5 = new Malls ();
		mall5.setMallId(5);
		mall5.setMallName("R City Mall");
		mall5.setAddress("LBS Rd, Amrut Nagar, Ghatkopar West, Mumbai, Maharashtra 400086");
		mall5.setDescription("R City Mall is a shopping mall located in Ghatkopar West, Mumbai. ");
		
		
		List<Malls> malls=new ArrayList<Malls>();
		malls.add(mall1);
		malls.add(mall2);
		malls.add(mall3);
		malls.add(mall4);
		malls.add(mall5);
		
		city1.getMalls().add(mall1);
		city1.getMalls().add(mall2);
		city1.getMalls().add(mall3);
		city1.getMalls().add(mall4);
		city1.getMalls().add(mall5);
		
		mall1.setCity(city1);
		mall2.setCity(city1); 
		mall3.setCity(city1); 
		mall4.setCity(city1); 
		mall5.setCity(city1); 
		
		session.save(city1);
		session.save(touristPlace1);   
		session.save(touristPlace2);
		session.save(touristPlace3);
		session.save(touristPlace4);
		session.save(touristPlace5);
		session.save(hotel1);
		session.save(hotel2);
		session.save(hotel3);
		session.save(hotel4);
		session.save(hotel5);
		session.save(restaurant1);
		session.save(restaurant2);
		session.save(restaurant3);
		session.save(restaurant4);
		session.save(restaurant5);
		session.save(mall1);
		session.save(mall2);
		session.save(mall3);
		session.save(mall4);
		session.save(mall5);
		
		tx.commit();
		session.close();
		System.out.println("Objects saved successfully...");
		
		*/
	} 
}