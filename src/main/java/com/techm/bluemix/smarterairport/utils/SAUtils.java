package com.techm.bluemix.smarterairport.utils;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.ProxyAuthenticationStrategy;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;


public class SAUtils {
	

	
	public static Map<String, String> flightCodeMap;
	public static Map<String, String> countryCodeMap;
	
	public static Map<String, Integer> daysMap;
	public static Map<String, String> latMap;
	public static Map<String, String> lonMap;
	public static Map<String, String> airlineCodeMap;
	
	static {
		flightCodeMap = new HashMap<String, String>();
		flightCodeMap.put("JP", "Adria Airways");
		flightCodeMap.put("A3", "Aegean Airlines");
		flightCodeMap.put("EI", "Aer Lingus");
		flightCodeMap.put("NG", "Aero Contractors");
		flightCodeMap.put("P5", "Aero República");
		flightCodeMap.put("SU", "Aeroflot");
		flightCodeMap.put("AR", "Aerolineas Argentinas");
		flightCodeMap.put("2K", "Aerolineas Galapagos S.A. Aerogal");
		flightCodeMap.put("AM", "Aeromexico");
		flightCodeMap.put("8U", "Afriqiyah Airways");
		flightCodeMap.put("ZI", "Aigle Azur");
		flightCodeMap.put("AH", "Air Algérie");
		flightCodeMap.put("G9", "Air Arabia");
		flightCodeMap.put("KC", "Air Astana");
		flightCodeMap.put("UU", "Air Austral");
		flightCodeMap.put("BT", "Air Baltic");
		flightCodeMap.put("AB", "Air Berlin");
		flightCodeMap.put("BP", "Air Botswana");
		flightCodeMap.put("2J", "Air Burkina");
		flightCodeMap.put("SM", "Air Cairo");
		flightCodeMap.put("TY", "Air Caledonie");
		flightCodeMap.put("AC", "Air Canada");
		flightCodeMap.put("TX", "Air Caraibes");
		flightCodeMap.put("CA", "Air China Limited");
		flightCodeMap.put("XK", "Air Corsica");
		flightCodeMap.put("UX", "Air Europa");
		flightCodeMap.put("AF", "Air France");
		flightCodeMap.put("AI", "Air India");
		flightCodeMap.put("JS", "Air Koryo");
		flightCodeMap.put("NX", "Air Macau");
		flightCodeMap.put("MD", "Air Madagascar");
		flightCodeMap.put("KM", "Air Malta");
		flightCodeMap.put("MK", "Air Mauritius");
		flightCodeMap.put("9U", "Air Moldova");
		flightCodeMap.put("SW", "Air Namibia");
		flightCodeMap.put("NZ", "Air New Zealand");
		flightCodeMap.put("PX", "Air Niugini");
		flightCodeMap.put("YW", "Air Nostrum");
		flightCodeMap.put("JU", "Air SERBIA a.d. Beograd");
		flightCodeMap.put("HM", "Air Seychelles");
		flightCodeMap.put("VT", "Air Tahiti");
		flightCodeMap.put("TN", "Air Tahiti Nui");
		flightCodeMap.put("TS", "Air Transat");
		flightCodeMap.put("RU", "AirBridgeCargo Airlines");
		flightCodeMap.put("SB", "Aircalin");
		flightCodeMap.put("AS", "Alaska Airlines");
		flightCodeMap.put("AZ", "Alitalia");
		flightCodeMap.put("NH", "All Nippon Airways");
		flightCodeMap.put("4W", "Allied Air");
		flightCodeMap.put("UJ", "AlMasria Universal Airlines");
		flightCodeMap.put("AA", "American Airlines");
		flightCodeMap.put("W3", "Arik Air");
		flightCodeMap.put("IZ", "Arkia Israeli Airlines");
		flightCodeMap.put("OZ", "Asiana");
		flightCodeMap.put("5Y", "Atlas Air");
		flightCodeMap.put("KK", "AtlasGlobal");
		flightCodeMap.put("AU", "Austral");
		flightCodeMap.put("OS", "Austrian");
		flightCodeMap.put("AV", "AVIANCA");
		flightCodeMap.put("O6", "Avianca Brasil");
		flightCodeMap.put("J2", "Azerbaijan Airlines");
		flightCodeMap.put("AD", "Azul Brazilian Airlines");
		flightCodeMap.put("UP", "Bahamasair");
		flightCodeMap.put("PG", "Bangkok Air");
		flightCodeMap.put("B2", "Belavia - Belarusian Airlines");
		flightCodeMap.put("8H", "BH AIR");
		flightCodeMap.put("BG", "Biman");
		flightCodeMap.put("NT", "Binter Canarias");
		flightCodeMap.put("0B", "Blue Air");
		flightCodeMap.put("BV", "Blue Panorama");
		flightCodeMap.put("BM", "bmi Regional");
		flightCodeMap.put("OB", "Boliviana de Aviación - BoA");
		flightCodeMap.put("TF", "Braathens Regional Aviation AB");
		flightCodeMap.put("BA", "British Airways");
		flightCodeMap.put("SN", "Brussels Airlines");
		flightCodeMap.put("FB", "Bulgaria air");
		flightCodeMap.put("5C", "C.A.L. Cargo Airlines");
		flightCodeMap.put("JD", "Capital Airlines");
		flightCodeMap.put("W8", "Cargojet Airways");
		flightCodeMap.put("CV", "Cargolux S.A.");
		flightCodeMap.put("BW", "Caribbean Airlines");
		flightCodeMap.put("V3", "Carpatair");
		flightCodeMap.put("KA", "Cathay Dragon");
		flightCodeMap.put("CX", "Cathay Pacific");
		flightCodeMap.put("CI", "China Airlines");
		flightCodeMap.put("MU", "China Eastern");
		flightCodeMap.put("CF", "China Postal Airlines");
		flightCodeMap.put("CZ", "China Southern Airlines");
		flightCodeMap.put("WX", "CityJet");
		flightCodeMap.put("MN", "Comair");
		flightCodeMap.put("DE", "Condor");
		flightCodeMap.put("CM", "COPA Airlines");
		flightCodeMap.put("XC", "Corendon Airlines");
		flightCodeMap.put("SS", "Corsair International");
		flightCodeMap.put("OU", "Croatia Airlines");
		flightCodeMap.put("CU", "Cubana");
		flightCodeMap.put("OK", "Czech Airlines j.s.c");
		flightCodeMap.put("DL", "Delta Air Lines");
		flightCodeMap.put("D0", "DHL Air");
		flightCodeMap.put("ES", "DHL Aviation EEMEA B.S.C.(c)");
		flightCodeMap.put("Z6", "Dniproavia");
		flightCodeMap.put("MS", "Egyptair");
		flightCodeMap.put("LY", "EL AL");
		flightCodeMap.put("EK", "Emirates");
		flightCodeMap.put("ET", "Ethiopian Airlines");
		flightCodeMap.put("EY", "Etihad Airways");
		flightCodeMap.put("YU", "Euroatlantic Airways");
		flightCodeMap.put("QY", "European Air Transport");
		flightCodeMap.put("EW", "Eurowings");
		flightCodeMap.put("BR", "EVA Air");
		flightCodeMap.put("FX", "Federal Express");
		flightCodeMap.put("FJ", "Fiji Airways");
		flightCodeMap.put("AY", "Finnair");
		flightCodeMap.put("BE", "flybe");
		flightCodeMap.put("FZ", "flydubai");
		flightCodeMap.put("FT", "FlyEgypt");
		flightCodeMap.put("FH", "Freebird Airlines");
		flightCodeMap.put("GA", "Garuda");
		flightCodeMap.put("A9", "Georgian Airways");
		flightCodeMap.put("ST", "Germania");
		flightCodeMap.put("GF", "Gulf Air");
		flightCodeMap.put("HR", "Hahn Air");
		flightCodeMap.put("HU", "Hainan Airlines");
		flightCodeMap.put("HA", "Hawaiian Airlines");
		flightCodeMap.put("5K", "Hi Fly");
		flightCodeMap.put("HX", "Hong Kong Airlines");
		flightCodeMap.put("UO", "Hong Kong Express Airways");
		flightCodeMap.put("IB", "IBERIA");
		flightCodeMap.put("FI", "Icelandair");
		flightCodeMap.put("7i", "InselAir");
		flightCodeMap.put("4O", "Interjet");
		flightCodeMap.put("IR", "Iran Air");
		flightCodeMap.put("EP", "Iran Aseman Airlines");
		flightCodeMap.put("6H", "Israir");
		flightCodeMap.put("JL", "Japan Airlines");
		flightCodeMap.put("J9", "Jazeera Airways");
		flightCodeMap.put("9W", "Jet Airways");
		flightCodeMap.put("B6", "JetBlue");
		flightCodeMap.put("R5", "Jordan Aviation");
		flightCodeMap.put("5N", "JSC Nordavia-RA");
		flightCodeMap.put("HO", "Juneyao Airlines");
		flightCodeMap.put("KQ", "Kenya Airways");
		flightCodeMap.put("Y9", "Kish Air");
		flightCodeMap.put("KL", "KLM");
		flightCodeMap.put("KE", "Korean Air");
		flightCodeMap.put("KU", "Kuwait Airways");
		flightCodeMap.put("LR", "LACSA");
		flightCodeMap.put("TM", "LAM");
		flightCodeMap.put("QV", "Lao Airlines");
		flightCodeMap.put("4M", "LATAM Airlines Argentina");
		flightCodeMap.put("JJ", "LATAM Airlines Brasil");
		flightCodeMap.put("4C", "LATAM Airlines Colombia");
		flightCodeMap.put("XL", "LATAM Airlines Ecuador");
		flightCodeMap.put("LA", "LATAM Airlines Group");
		flightCodeMap.put("PZ", "LATAM Airlines Paraguay");
		flightCodeMap.put("LP", "LATAM Airlines Peru");
		flightCodeMap.put("M3", "LATAM Cargo Brasil");
		flightCodeMap.put("UC", "LATAM Cargo Chile");
		flightCodeMap.put("M7", "LATAM Cargo Mexico");
		flightCodeMap.put("LI", "LIAT Airlines");
		flightCodeMap.put("N4", "LLC NORD WIND");
		flightCodeMap.put("GJ", "Loong Air");
		flightCodeMap.put("LO", "LOT Polish Airlines");
		flightCodeMap.put("8L", "Lucky Air");
		flightCodeMap.put("LH", "Lufthansa");
		flightCodeMap.put("LH", "Lufthansa Cargo");
		flightCodeMap.put("CL", "Lufthansa CityLine");
		flightCodeMap.put("LG", "Luxair");
		flightCodeMap.put("W5", "Mahan Air");
		flightCodeMap.put("MH", "Malaysia Airlines");
		flightCodeMap.put("AE", "Mandarin Airlines");
		flightCodeMap.put("MP", "Martinair Cargo");
		flightCodeMap.put("L6", "Mauritania Airlines International");
		flightCodeMap.put("ME", "MEA");
		flightCodeMap.put("IG", "Meridiana fly");
		flightCodeMap.put("OM", "MIAT");
		flightCodeMap.put("M4", "Mistral Air");
		flightCodeMap.put("YM", "Montenegro Airlines");
		flightCodeMap.put("8M", "Myanmar Airways International");
		flightCodeMap.put("NE", "Nesma Airlines");
		flightCodeMap.put("2N", "Nextjet");
		flightCodeMap.put("NP", "Nile Air");
		flightCodeMap.put("KZ", "Nippon Cargo Airlines (NCA)");
		flightCodeMap.put("BJ", "Nouvelair");
		flightCodeMap.put("BK", "Okay Airways");
		flightCodeMap.put("OA", "Olympic Air");
		flightCodeMap.put("WY", "Oman Air");
		flightCodeMap.put("8Q", "Onur Air");
		flightCodeMap.put("OF", "Overland Airways");
		flightCodeMap.put("PC", "Pegasus Airlines");
		flightCodeMap.put("NI", "PGA-Portugália Airlines");
		flightCodeMap.put("PR", "Philippine Airlines");
		flightCodeMap.put("PK", "PIA");
		flightCodeMap.put("PW", "Precision Air");
		flightCodeMap.put("PV", "PrivatAir");
		flightCodeMap.put("QF", "Qantas");
		flightCodeMap.put("QR", "Qatar Airways");
		flightCodeMap.put("FV", "Rossiya Airlines");
		flightCodeMap.put("AT", "Royal Air Maroc");
		flightCodeMap.put("BI", "Royal Brunei");
		flightCodeMap.put("RJ", "Royal Jordanian");
		flightCodeMap.put("WB", "RwandAir");
		flightCodeMap.put("S7", "S7 Airlines");
		flightCodeMap.put("SA", "SAA");
		flightCodeMap.put("FA", "Safair");
		flightCodeMap.put("4Q", "Safi Airways");
		flightCodeMap.put("S3", "Santa Barbara");
		flightCodeMap.put("SK", "SAS");
		flightCodeMap.put("SP", "SATA Air Açores");
		flightCodeMap.put("S4", "SATA Internacional");
		flightCodeMap.put("SV", "Saudi Arabian Airlines");
		flightCodeMap.put("SC", "Shandong Airlines");
		flightCodeMap.put("ZH", "Shenzhen Airlines");
		flightCodeMap.put("SQ", "SIA");
		flightCodeMap.put("SQ", "SIA Cargo");
		flightCodeMap.put("7L", "Silk Way West Airlines");
		flightCodeMap.put("MI", "Silkair");
		flightCodeMap.put("H2", "SKY Airline");
		flightCodeMap.put("XZ", "South African Express Airways");
		flightCodeMap.put("UL", "SriLankan");
		flightCodeMap.put("XQ", "SunExpress");
		flightCodeMap.put("PY", "Surinam Airways");
		flightCodeMap.put("LX", "SWISS");
		flightCodeMap.put("RB", "Syrianair");
		flightCodeMap.put("DT", "TAAG - Angola Airlines");
		flightCodeMap.put("TA", "TACA");
		flightCodeMap.put("T0", "TACA Peru");
		flightCodeMap.put("VR", "TACV Cabo Verde Airlines");
		flightCodeMap.put("EQ", "TAME - Linea Aérea del Ecuador");
		flightCodeMap.put("TP", "TAP Portugal");
		flightCodeMap.put("RO", "TAROM");
		flightCodeMap.put("TG", "Thai Airways International");
		flightCodeMap.put("SL", "Thai Lion Air");
		flightCodeMap.put("TK", "THY - Turkish Airlines");
		flightCodeMap.put("GS", "Tianjin Airlines");
		flightCodeMap.put("3V", "TNT Airways S.A.");
		flightCodeMap.put("GE", "TransAsia Airways");
		flightCodeMap.put("X3", "TUIfly");
		flightCodeMap.put("TU", "Tunisair");
		flightCodeMap.put("PS", "Ukraine International Airlines");
		flightCodeMap.put("UA", "United Airlines");
		flightCodeMap.put("5X", "UPS Airlines");
		flightCodeMap.put("U6", "Ural Airlines");
		flightCodeMap.put("UT", "UTair");
		flightCodeMap.put("HY", "Uzbekistan Airways");
		flightCodeMap.put("VJ", "Vietjet");
		flightCodeMap.put("VN", "Vietnam Airlines");
		flightCodeMap.put("VS", "Virgin Atlantic");
		flightCodeMap.put("VA", "Virgin Australia");
		flightCodeMap.put("Y4", "Volaris");
		flightCodeMap.put("VI", "Volga-Dnepr Airlines");
		flightCodeMap.put("G3", "VRG Linhas Aéreas S.A. - Grupo GOL");
		flightCodeMap.put("VY", "Vueling");
		flightCodeMap.put("EB", "Wamos Air");
		flightCodeMap.put("WS", "WestJet");
		flightCodeMap.put("WI", "White coloured by you");
		flightCodeMap.put("WF", "Wideroe");
		flightCodeMap.put("MF", "Xiamen Airlines");
		flightCodeMap.put("IY", "Yemenia");

		
		countryCodeMap= new HashMap<String, String>();
		countryCodeMap.put("GA", "/30339%3A4%3AUS");
		countryCodeMap.put("LA", "/90011%3A4%3AUS");
		countryCodeMap.put("NY", "/11368%3A4%3AUS");
		
		daysMap= new HashMap<String, Integer>();
		daysMap.put("/3days", 4);
		daysMap.put("/5days", 6);
		daysMap.put("/7days", 8);
		daysMap.put("/10days", 11);
		
		airlineCodeMap= new HashMap<String, String>();
		airlineCodeMap.put("Adria Airways (JP)", "ADR");
		airlineCodeMap.put("Aegean Airlines (A3)", "AEE");
		airlineCodeMap.put("Aer Lingus (EI)", "EIN");
		airlineCodeMap.put("Aero Contractors (NG)", "NIG");
		airlineCodeMap.put("Aero República (P5)", "RBP");
		airlineCodeMap.put("Aeroflot (SU)", "AFL");
		airlineCodeMap.put("Aerolineas Argentinas (AR)", "ARG");
		airlineCodeMap.put("Aerolineas Galapagos S.A. Aerogal (2K)", "GLG");
		airlineCodeMap.put("Aeromexico (AM)", "AMX");
		airlineCodeMap.put("Afriqiyah Airways (8U)", "AAW");
		airlineCodeMap.put("Aigle Azur (ZI)", "AAF");
		airlineCodeMap.put("Air Algérie (AH)", "DAH");
		airlineCodeMap.put("Air Arabia (G9)", "ABY");
		airlineCodeMap.put("Air Astana (KC)", "KZR");
		airlineCodeMap.put("Air Austral (UU)", "REU");
		airlineCodeMap.put("Air Baltic (BT)", "BTI");
		airlineCodeMap.put("Air Berlin (AB)", "BER");
		airlineCodeMap.put("Air Botswana (BP)", "BOT");
		airlineCodeMap.put("Air Burkina (2J)", "VBW");
		airlineCodeMap.put("Air Cairo (SM)", "MSC");
		airlineCodeMap.put("Air Caledonie (TY)", "TPC");
		airlineCodeMap.put("Air Canada (AC)", "ACA");
		airlineCodeMap.put("Air Caraibes (TX)", "FWI");
		airlineCodeMap.put("Air China Limited (CA)", "CCA");
		airlineCodeMap.put("Air Corsica (XK)", "CCM");
		airlineCodeMap.put("Air Europa (UX)", "AEA");
		airlineCodeMap.put("Air France (AF)", "AFR");
		airlineCodeMap.put("Air India  (AI)", "AIC");
		airlineCodeMap.put("Air Koryo (JS)", "KOR");
		airlineCodeMap.put("Air Macau (NX)", "AMU");
		airlineCodeMap.put("Air Madagascar (MD)", "MDG");
		airlineCodeMap.put("Air Malta  (KM)", "AMC");
		airlineCodeMap.put("Air Mauritius (MK)", "MAU");
		airlineCodeMap.put("Air Moldova (9U)", "MLD");
		airlineCodeMap.put("Air Namibia (SW)", "NMB");
		airlineCodeMap.put("Air New Zealand (NZ)", "ANZ");
		airlineCodeMap.put("Air Niugini (PX)", "ANG");
		airlineCodeMap.put("Air Nostrum (YW)", "ANE");
		airlineCodeMap.put("Air SERBIA a.d. Beograd (JU)", "ASL");
		airlineCodeMap.put("Air Seychelles (HM)", "SEY");
		airlineCodeMap.put("Air Tahiti (VT)", "VTA");
		airlineCodeMap.put("Air Tahiti Nui (TN)", "THT");
		airlineCodeMap.put("Air Transat (TS)", "TSC");
		airlineCodeMap.put("AirBridgeCargo Airlines (RU)", "ABW");
		airlineCodeMap.put("Aircalin (SB)", "ACI");
		airlineCodeMap.put("Alaska Airlines (AS)", "ASA");
		airlineCodeMap.put("Alitalia (AZ)", "AZA");
		airlineCodeMap.put("All Nippon Airways (NH)", "ANA");
		airlineCodeMap.put("Allied Air (4W)", "AJK");
		airlineCodeMap.put("AlMasria Universal Airlines (UJ)", "LMU");
		airlineCodeMap.put("American Airlines (AA)", "AAL");
		airlineCodeMap.put("Arik Air (W3)", "ARA");
		airlineCodeMap.put("Arkia Israeli Airlines  (IZ)", "AIZ");
		airlineCodeMap.put("Asiana (OZ)", "AAR");
		airlineCodeMap.put("Atlas Air (5Y)", "GTI");
		airlineCodeMap.put("AtlasGlobal (KK)", "KKK");
		airlineCodeMap.put("Austral (AU)", "AUT");
		airlineCodeMap.put("Austrian (OS)", "AUA");
		airlineCodeMap.put("AVIANCA (AV)", "AVA");
		airlineCodeMap.put("Avianca Brasil (O6)", "ONE");
		airlineCodeMap.put("Azerbaijan Airlines (J2)", "AHY");
		airlineCodeMap.put("Azul Brazilian Airlines (AD)", "AZU");
		airlineCodeMap.put("Bahamasair (UP)", "BHS");
		airlineCodeMap.put("Bangkok Air  (PG)", "BKP");
		airlineCodeMap.put("Belavia - Belarusian Airlines (B2)", "BRU");
		airlineCodeMap.put("BH AIR (8H)", "BGH");
		airlineCodeMap.put("Biman (BG)", "BBC");
		airlineCodeMap.put("Binter Canarias (NT)", "IBB");
		airlineCodeMap.put("Blue Air (0B)", "BMS");
		airlineCodeMap.put("Blue Panorama (BV)", "BPA");
		airlineCodeMap.put("bmi Regional (BM)", "BMR");
		airlineCodeMap.put("Boliviana de Aviación - BoA (OB)", "BOV");
		airlineCodeMap.put("Braathens Regional Aviation AB (TF)", "SCW");
		airlineCodeMap.put("British Airways (BA)", "BAW");
		airlineCodeMap.put("Brussels Airlines (SN)", "BEL");
		airlineCodeMap.put("Bulgaria air (FB)", "LZB");
		airlineCodeMap.put("C.A.L. Cargo Airlines (5C)", "ICL");
		airlineCodeMap.put("Capital Airlines (JD)", "CBJ");
		airlineCodeMap.put("Cargojet Airways  (W8)", "CJT");
		airlineCodeMap.put("Cargolux S.A. (CV)", "CLX");
		airlineCodeMap.put("Caribbean Airlines (BW)", "BWA");
		airlineCodeMap.put("Carpatair (V3)", "KRP");
		airlineCodeMap.put("Cathay Dragon (KA)", "HDA");
		airlineCodeMap.put("Cathay Pacific (CX)", "CPA");
		airlineCodeMap.put("China Airlines (CI)", "CAL");
		airlineCodeMap.put("China Eastern (MU)", "CES");
		airlineCodeMap.put("China Postal Airlines (CF)", "CYZ");
		airlineCodeMap.put("China Southern Airlines (CZ)", "CSN");
		airlineCodeMap.put("CityJet (WX)", "BCY");
		airlineCodeMap.put("Comair (MN)", "CAW");
		airlineCodeMap.put("Condor (DE)", "CFG");
		airlineCodeMap.put("COPA Airlines (CM)", "CMP");
		airlineCodeMap.put("Corendon Airlines (XC)", "CAI");
		airlineCodeMap.put("Corsair International (SS)", "CRL");
		airlineCodeMap.put("Croatia Airlines (OU)", "CTN");
		airlineCodeMap.put("Cubana (CU)", "CUB");
		airlineCodeMap.put("Czech Airlines j.s.c (OK)", "CSA");
		airlineCodeMap.put("Delta Air Lines (DL)", "DAL");
		airlineCodeMap.put("DHL Air  (D0)", "DHK");
		airlineCodeMap.put("DHL Aviation EEMEA B.S.C.(c)  (ES)", "DHX");
		airlineCodeMap.put("Dniproavia (Z6)", "UDN");
		airlineCodeMap.put("Egyptair (MS)", "MSR");
		airlineCodeMap.put("EL AL (LY)", "ELY");
		airlineCodeMap.put("Emirates (EK)", "UAE");
		airlineCodeMap.put("Ethiopian Airlines (ET)", "ETH");
		airlineCodeMap.put("Etihad Airways (EY)", "ETD");
		airlineCodeMap.put("Euroatlantic Airways (YU)", "MMZ");
		airlineCodeMap.put("European Air Transport (QY)", "BCS");
		airlineCodeMap.put("Eurowings (EW)", "EWG");
		airlineCodeMap.put("EVA Air (BR)", "EVA");
		airlineCodeMap.put("Federal Express (FX)", "FDX");
		airlineCodeMap.put("Fiji Airways (FJ)", "FJI");
		airlineCodeMap.put("Finnair (AY)", "FIN");
		airlineCodeMap.put("flybe (BE)", "BEE");
		airlineCodeMap.put("flydubai (FZ)", "FDB");
		airlineCodeMap.put("FlyEgypt (FT)", "FEG");
		airlineCodeMap.put("Freebird Airlines (FH)", "FHY");
		airlineCodeMap.put("Garuda (GA)", "GIA");
		airlineCodeMap.put("Georgian Airways (A9)", "TGZ");
		airlineCodeMap.put("Germania (ST)", "GMI");
		airlineCodeMap.put("Gulf Air (GF)", "GFA");
		airlineCodeMap.put("Hahn Air (HR)", "HHN");
		airlineCodeMap.put("Hainan Airlines (HU)", "CHH");
		airlineCodeMap.put("Hawaiian Airlines (HA)", "HAL");
		airlineCodeMap.put("Hi Fly (5K)", "HFY");
		airlineCodeMap.put("Hong Kong Airlines (HX)", "CRK");
		airlineCodeMap.put("Hong Kong Express Airways  (UO)", "HKE");
		airlineCodeMap.put("IBERIA (IB)", "IBE");
		airlineCodeMap.put("Icelandair (FI)", "ICE");
		airlineCodeMap.put("InselAir (7i)", "INC");
		airlineCodeMap.put("Interjet (4O)", "AIJ");
		airlineCodeMap.put("Iran Air (IR)", "IRA");
		airlineCodeMap.put("Iran Aseman Airlines (EP)", "IRC");
		airlineCodeMap.put("Israir (6H)", "ISR");
		airlineCodeMap.put("Japan Airlines (JL)", "JAL");
		airlineCodeMap.put("Jazeera Airways  (J9)", "JZR");
		airlineCodeMap.put("Jet Airways (9W)", "JAI");
		airlineCodeMap.put("JetBlue (B6)", "JBU");
		airlineCodeMap.put("Jordan Aviation (R5)", "JAV");
		airlineCodeMap.put("JSC Nordavia-RA (5N)", "AUL");
		airlineCodeMap.put("Juneyao Airlines (HO)", "DKH");
		airlineCodeMap.put("Kenya Airways (KQ)", "KQA");
		airlineCodeMap.put("Kish Air (Y9)", "IRK");
		airlineCodeMap.put("KLM (KL)", "KLM");
		airlineCodeMap.put("Korean Air (KE)", "KAL");
		airlineCodeMap.put("Kuwait Airways (KU)", "KAC");
		airlineCodeMap.put("LACSA (LR)", "LRC");
		airlineCodeMap.put("LAM (TM)", "LAM");
		airlineCodeMap.put("Lao Airlines (QV)", "LAO");
		airlineCodeMap.put("LATAM Airlines Argentina (4M)", "DSM");
		airlineCodeMap.put("LATAM Airlines Brasil (JJ)", "TAM");
		airlineCodeMap.put("LATAM Airlines Colombia (4C)", "ARE");
		airlineCodeMap.put("LATAM Airlines Ecuador (XL)", "LNE");
		airlineCodeMap.put("LATAM Airlines Group (LA)", "LAN");
		airlineCodeMap.put("LATAM Airlines Paraguay (PZ)", "LAP");
		airlineCodeMap.put("LATAM Airlines Peru (LP)", "LPE");
		airlineCodeMap.put("LATAM Cargo Brasil (M3)", "TUS");
		airlineCodeMap.put("LATAM Cargo Chile (UC)", "LCO");
		airlineCodeMap.put("LATAM Cargo Mexico (M7)", "MAA");
		airlineCodeMap.put("LIAT Airlines (LI)", "LIA");
		airlineCodeMap.put("LLC NORD WIND (N4)", "NWS");
		airlineCodeMap.put("Loong Air (GJ)", "CDC");
		airlineCodeMap.put("LOT Polish Airlines (LO)", "LOT");
		airlineCodeMap.put("Lucky Air (8L)", "LKE");
		airlineCodeMap.put("Lufthansa (LH)", "DLH");
		airlineCodeMap.put("Lufthansa Cargo (LH)", "GEC");
		airlineCodeMap.put("Lufthansa CityLine (CL)", "CLH");
		airlineCodeMap.put("Luxair (LG)", "LGL");
		airlineCodeMap.put("Mahan Air (W5)", "IRM");
		airlineCodeMap.put("Malaysia Airlines (MH)", "MAS");
		airlineCodeMap.put("Mandarin Airlines (AE)", "MDA");
		airlineCodeMap.put("Martinair Cargo (MP)", "MPH");
		airlineCodeMap.put("Mauritania Airlines International (L6)", "MAI");
		airlineCodeMap.put("MEA (ME)", "MEA");
		airlineCodeMap.put("Meridiana fly (IG)", "ISS");
		airlineCodeMap.put("MIAT (OM)", "MGL");
		airlineCodeMap.put("Mistral Air (M4)", "MSA");
		airlineCodeMap.put("Montenegro Airlines (YM)", "MGX");
		airlineCodeMap.put("Myanmar Airways International (8M)", "MMA");
		airlineCodeMap.put("Nesma Airlines (NE)", "NMA");
		airlineCodeMap.put("Nextjet (2N)", "NTJ");
		airlineCodeMap.put("Nile Air (NP)", "NIA");
		airlineCodeMap.put("Nippon Cargo Airlines (NCA) (KZ)", "NCA");
		airlineCodeMap.put("Nouvelair (BJ)", "LBT");
		airlineCodeMap.put("Okay Airways (BK)", "OKA");
		airlineCodeMap.put("Olympic Air (OA)", "OAL");
		airlineCodeMap.put("Oman Air (WY)", "OAS");
		airlineCodeMap.put("Onur Air (8Q)", "OHY");
		airlineCodeMap.put("Overland Airways (OF)", "OLA");
		airlineCodeMap.put("Pegasus Airlines (PC)", "PGT");
		airlineCodeMap.put("PGA-Portugália Airlines (NI)", "PGA");
		airlineCodeMap.put("Philippine Airlines (PR)", "PAL");
		airlineCodeMap.put("PIA (PK)", "PIA");
		airlineCodeMap.put("Precision Air (PW)", "PRF");
		airlineCodeMap.put("PrivatAir (PV)", "PTI");
		airlineCodeMap.put("Qantas (QF)", "QFA");
		airlineCodeMap.put("Qatar Airways (QR)", "QTR");
		airlineCodeMap.put("Rossiya Airlines  (FV)", "SDM");
		airlineCodeMap.put("Royal Air Maroc (AT)", "RAM");
		airlineCodeMap.put("Royal Brunei (BI)", "RBA");
		airlineCodeMap.put("Royal Jordanian (RJ)", "RJA");
		airlineCodeMap.put("RwandAir (WB)", "RWD");
		airlineCodeMap.put("S7 Airlines (S7)", "SBI");
		airlineCodeMap.put("SAA (SA)", "SAA");
		airlineCodeMap.put("Safair (FA)", "SFR");
		airlineCodeMap.put("Safi Airways (4Q)", "SFW");
		airlineCodeMap.put("Santa Barbara (S3)", "BBR");
		airlineCodeMap.put("SAS (SK)", "SAS");
		airlineCodeMap.put("SATA Air Açores (SP)", "SAT");
		airlineCodeMap.put("SATA Internacional (S4)", "RZO");
		airlineCodeMap.put("Saudi Arabian Airlines (SV)", "SVA");
		airlineCodeMap.put("Shandong Airlines  (SC)", "CDG");
		airlineCodeMap.put("Shenzhen Airlines  (ZH)", "CSZ");
		airlineCodeMap.put("SIA (SQ)", "SIA");
		airlineCodeMap.put("SIA Cargo (SQ)", "SIA");
		airlineCodeMap.put("Silk Way West Airlines (7L)", "AZG");
		airlineCodeMap.put("Silkair (MI)", "SLK");
		airlineCodeMap.put("SKY Airline (H2)", "SKU");
		airlineCodeMap.put("South African Express Airways (XZ)", "EXY");
		airlineCodeMap.put("SriLankan (UL)", "ALK");
		airlineCodeMap.put("SunExpress (XQ)", "SXS");
		airlineCodeMap.put("Surinam Airways (PY)", "SLM");
		airlineCodeMap.put("SWISS (LX)", "SWR");
		airlineCodeMap.put("Syrianair (RB)", "SYR");
		airlineCodeMap.put("TAAG - Angola Airlines (DT)", "DTA");
		airlineCodeMap.put("TACA (TA)", "TAI");
		airlineCodeMap.put("TACA Peru (T0)", "TPU");
		airlineCodeMap.put("TACV Cabo Verde Airlines (VR)", "TCV");
		airlineCodeMap.put("TAME - Linea Aérea del Ecuador (EQ)", "TAE");
		airlineCodeMap.put("TAP Portugal (TP)", "TAP");
		airlineCodeMap.put("TAROM  (RO)", "ROT");
		airlineCodeMap.put("Thai Airways International (TG)", "THA");
		airlineCodeMap.put("Thai Lion Air (SL)", "TLM");
		airlineCodeMap.put("THY - Turkish Airlines (TK)", "THY");
		airlineCodeMap.put("Tianjin Airlines (GS)", "GCR");
		airlineCodeMap.put("TNT Airways S.A. (3V)", "TAY");
		airlineCodeMap.put("TransAsia Airways (GE)", "TNA");
		airlineCodeMap.put("TUIfly (X3)", "TUI");
		airlineCodeMap.put("Tunisair (TU)", "TAR");
		airlineCodeMap.put("Ukraine International Airlines (PS)", "AUI");
		airlineCodeMap.put("United Airlines (UA)", "UAL");
		airlineCodeMap.put("UPS Airlines (5X)", "UPS");
		airlineCodeMap.put("Ural Airlines (U6)", "SVR");
		airlineCodeMap.put("UTair (UT)", "UTA");
		airlineCodeMap.put("Uzbekistan Airways (HY)", "UZB");
		airlineCodeMap.put("Vietjet (VJ)", "VJC");
		airlineCodeMap.put("Vietnam Airlines (VN)", "HVN");
		airlineCodeMap.put("Virgin Atlantic (VS)", "VIR");
		airlineCodeMap.put("Virgin Australia (VA)", "VAU");
		airlineCodeMap.put("Volaris (Y4)", "VOI");
		airlineCodeMap.put("Volga-Dnepr Airlines (VI)", "VDA");
		airlineCodeMap.put("VRG Linhas Aéreas S.A. - Grupo GOL (G3)", "GLO");
		airlineCodeMap.put("Vueling (VY)", "VLG");
		airlineCodeMap.put("Wamos Air (EB)", "PLM");
		airlineCodeMap.put("WestJet (WS)", "WJA");
		airlineCodeMap.put("White coloured by you (WI)", "WHT");
		airlineCodeMap.put("Wideroe (WF)", "WIF");
		airlineCodeMap.put("Xiamen Airlines (MF)", "CXA");
		airlineCodeMap.put("Yemenia (IY)", "IYE");


		

		
		latMap=new HashMap<String, String>();
		latMap.put("New York", "42.34");
		latMap.put("Ottawa", "45.43");
		latMap.put("London", "51.51");
		latMap.put("Paris", "48.85");
		latMap.put("Rome", "41.9");
		latMap.put("Moscow", "55.75");
		latMap.put("Mumbai", "18.97");
		latMap.put("Kathmandu", "27.7");
		latMap.put("Beijing", "39.91");
		latMap.put("Tokyo", "35.68");

		
		lonMap=new HashMap<String, String>();
		lonMap.put("New York", "-75.18");
		lonMap.put("Ottawa", "-75.68");
		lonMap.put("London", "0.13");
		lonMap.put("Paris", "2.35");
		lonMap.put("Rome", "12.5");
		lonMap.put("Moscow", "37.61");
		lonMap.put("Mumbai", "72.83");
		lonMap.put("Kathmandu", "85.33");
		lonMap.put("Beijing", "116.38");
		lonMap.put("Tokyo", "139.68");

		
		
		
	}
	
	public static ClientHttpRequestFactory getClientFactory(){
		
		
		CredentialsProvider credsProvider = new BasicCredentialsProvider();
		credsProvider.setCredentials( new AuthScope(SAConstant.localhost, SAConstant.localport), new UsernamePasswordCredentials(SAConstant.uname, SAConstant.pword) );
		HttpClientBuilder clientBuilder = HttpClientBuilder.create();

		clientBuilder.useSystemProperties();
		clientBuilder.setProxy(new HttpHost(SAConstant.localhost, SAConstant.localport));
		clientBuilder.setDefaultCredentialsProvider(credsProvider);
		clientBuilder.setProxyAuthenticationStrategy(new ProxyAuthenticationStrategy());

		CloseableHttpClient client = clientBuilder.build();

		HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
		factory.setHttpClient(client);
		return factory;
	}
}
