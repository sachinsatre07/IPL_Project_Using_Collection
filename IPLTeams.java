package IPL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IPLTeams {

	public static void main(String[] args) {
		// Master Map: Year -> (Team -> Players)
		Map<Integer, Map<String, List<Player>>> iplData = new HashMap<>();

		// ---------------- 2022 ----------------
		Map<String, List<Player>> teams2022 = new HashMap<>();

		teams2022.put("RCB", Arrays.asList(new Player("Virat Kohli", 18, "RCB", 4500, 16),
				new Player("Faf du Plessis", 13, "RCB", 3200, 5), new Player("Glenn Maxwell", 32, "RCB", 2800, 25),
				new Player("Dinesh Karthik", 19, "RCB", 3400, 0), new Player("Harshal Patel", 23, "RCB", 400, 90),
				new Player("Mohammed Siraj", 73, "RCB", 150, 80), new Player("Wanindu Hasaranga", 49, "RCB", 500, 65),
				new Player("Shahbaz Ahmed", 21, "RCB", 300, 25), new Player("Anuj Rawat", 1, "RCB", 200, 0),
				new Player("Suyash Prabhudessai", 31, "RCB", 100, 0),
				new Player("Josh Hazlewood", 38, "RCB", 100, 70)));
		teams2022.put("CSK", Arrays.asList(new Player("MS Dhoni", 7, "CSK", 4800, 0),
				new Player("Ravindra Jadeja", 8, "CSK", 2200, 120), new Player("Ruturaj Gaikwad", 31, "CSK", 1800, 0),
				new Player("Moeen Ali", 18, "CSK", 1000, 20), new Player("Ambati Rayudu", 9, "CSK", 4200, 0),
				new Player("Devon Conway", 88, "CSK", 600, 0), new Player("Dwaine Pretorius", 29, "CSK", 350, 20),
				new Player("Deepak Chahar", 90, "CSK", 400, 60), new Player("Mukesh Choudhary", 58, "CSK", 50, 15),
				new Player("Shivam Dube", 25, "CSK", 800, 10), new Player("Adam Milne", 20, "CSK", 100, 40)));
		iplData.put(2022, teams2022);
		System.out.println();

		for (Map.Entry<Integer, Map<String, List<Player>>> yearEntry : iplData.entrySet()) {
			int year = yearEntry.getKey();
			System.out.println("====================== Teams in IPL " + year + " ======================");
			System.out.println();

			for (Map.Entry<String, List<Player>> teamEntry : yearEntry.getValue().entrySet()) {
				String teamName = teamEntry.getKey();
				System.out.println("======================== Team: " + teamName + " ============================");
				System.out.println();

				List<Player> batsmen = new ArrayList<>();
				List<Player> bowlers = new ArrayList<>();

				// ✅ Print player table and collect batsmen/bowlers
				for (Player p : teamEntry.getValue()) {
					System.out.printf("%-20s %-10d %-10s %-10d %-10d%n", p.getName(), p.getJnumber(), p.getTname(),
							p.getRuns(), p.getWickets());

					if (p.getRuns() > 2000) {
						batsmen.add(p);
					}
					if (p.getWickets() > 30) {
						bowlers.add(p);
					}
				}

				System.out.println();

				// ✅ Print batsmen
				for (Player player : batsmen) {
					System.out.println(" Batsman of team " + teamName + " : " + player.getName());
				}

				System.out.println();

				// ✅ Print bowlers
				for (Player player : bowlers) {
					System.out.println(" Bowler of team " + teamName + " : " + player.getName());
				}

				// for batsman
				for (Player player : bowlers)

					System.out.println();
			}

		}

		// ---------------- 2023 ----------------
		Map<String, List<Player>> teams2023 = new HashMap<>();
		teams2023.put("RCB", Arrays.asList(new Player("Virat Kohli", 18, "RCB", 5000, 20),
				new Player("Faf du Plessis", 13, "RCB", 3600, 8), new Player("Glenn Maxwell", 32, "RCB", 2000, 10),
				new Player("Dinesh Karthik", 19, "RCB", 3500, 0), new Player("Harshal Patel", 23, "RCB", 500, 95),
				new Player("Mohammed Siraj", 73, "RCB", 200, 100), new Player("Wanindu Hasaranga", 49, "RCB", 600, 80),
				new Player("Shahbaz Ahmed", 21, "RCB", 400, 30), new Player("Anuj Rawat", 1, "RCB", 300, 0),
				new Player("Suyash Prabhudessai", 31, "RCB", 150, 0),
				new Player("Josh Hazlewood", 38, "RCB", 120, 75)));
		teams2023.put("MI", Arrays.asList(new Player("Rohit Sharma", 45, "MI", 4800, 0),
				new Player("Ishan Kishan", 23, "MI", 2000, 0), new Player("Suryakumar Yadav", 63, "MI", 2800, 0),
				new Player("Cameron Green", 42, "MI", 500, 15), new Player("Tim David", 21, "MI", 700, 0),
				new Player("Tilak Varma", 9, "MI", 600, 0), new Player("Kieron Pollard", 55, "MI", 3300, 60),
				new Player("Jasprit Bumrah", 93, "MI", 100, 110), new Player("Jofra Archer", 22, "MI", 200, 90),
				new Player("Hrithik Shokeen", 28, "MI", 150, 10), new Player("Piyush Chawla", 11, "MI", 500, 150)));
		iplData.put(2023, teams2023);

		int year = 2023;

		if (teams2023 != null) {
			System.out.println("====================== Teams in IPL " + year + " ======================");
			System.out.println();

			for (Map.Entry<String, List<Player>> teamEntry : teams2023.entrySet()) {
				String teamName = teamEntry.getKey();

				System.out.println("======================== Team: " + teamName + " ============================");
				System.out.println();

				List<Player> batsmen = new ArrayList<>();
				List<Player> bowlers = new ArrayList<>();

				for (Player p : teamEntry.getValue()) {
					System.out.printf("%-20s %-10d %-10s %-10d %-10d%n", p.getName(), p.getJnumber(), p.getTname(),
							p.getRuns(), p.getWickets());

					if (p.getRuns() > 2000) {
						batsmen.add(p);
					}
					if (p.getWickets() > 30) {
						bowlers.add(p);
					}
				}

				System.out.println();

				for (Player player : batsmen) {
					System.out.println(" Batsman of team " + teamName + " : " + player.getName());
				}

				System.out.println();

				for (Player player : bowlers) {
					System.out.println(" Bowler of team " + teamName + " : " + player.getName());
				}

				System.out.println();
			}
		}

		// ---------------- 2024 ----------------
		Map<String, List<Player>> teams2024 = new HashMap<>();
		teams2024.put("PBKS", Arrays.asList(new Player("Shikhar Dhawan", 42, "PBKS", 6200, 0),
				new Player("Sam Curran", 58, "PBKS", 1200, 60), new Player("Liam Livingstone", 7, "PBKS", 1000, 20),
				new Player("Jitesh Sharma", 99, "PBKS", 8000, 0), new Player("Jonny Bairstow", 51, "PBKS", 1700, 0),
				new Player("Shahrukh Khan", 17, "PBKS", 600, 5), new Player("Harpreet Brar", 95, "PBKS", 400, 25),
				new Player("Rahul Chahar", 28, "PBKS", 200, 60), new Player("Arshdeep Singh", 2, "PBKS", 100, 70),
				new Player("Kagiso Rabada", 25, "PBKS", 200, 110), new Player("Rishi Dhawan", 19, "PBKS", 450, 35)));

		teams2024.put("CSK", Arrays.asList(new Player("Ruturaj Gaikwad", 31, "CSK", 1700, 0),
				new Player("Moeen Ali", 18, "CSK", 1400, 25), new Player("MS Dhoni", 7, "CSK", 5000, 0),
				new Player("Shivam Dube", 25, "CSK", 1200, 15), new Player("Ravindra Jadeja", 8, "CSK", 2500, 130),
				new Player("Ambati Rayudu", 9, "CSK", 4300, 0), new Player("Devon Conway", 88, "CSK", 1000, 0),
				new Player("Deepak Chahar", 90, "CSK", 500, 70), new Player("Matheesa Pathirana", 81, "CSK", 50, 25),
				new Player("Tushar Deshpande", 70, "CSK", 40, 35), new Player("Ben Stokes", 55, "CSK", 2500, 45)));
		iplData.put(2024, teams2024);

		int year1 = 2024;

		if (teams2024 != null) {
			System.out.println("====================== Teams in IPL " + year1 + " ======================");
			System.out.println();

			for (Map.Entry<String, List<Player>> teamEntry : teams2024.entrySet()) {
				String teamName = teamEntry.getKey();

				System.out.println("======================== Team: " + teamName + " ============================");
				System.out.println();

				List<Player> batsmen = new ArrayList<>();
				List<Player> bowlers = new ArrayList<>();

				for (Player p : teamEntry.getValue()) {
					System.out.printf("%-20s %-10d %-10s %-10d %-10d%n", p.getName(), p.getJnumber(), p.getTname(),
							p.getRuns(), p.getWickets());

					if (p.getRuns() > 2000) {
						batsmen.add(p);
					}
					if (p.getWickets() > 30) {
						bowlers.add(p);
					}
				}

				System.out.println();

				for (Player player : batsmen) {
					System.out.println(" Batsman of team " + teamName + " : " + player.getName());
				}

				System.out.println();

				for (Player player : bowlers) {
					System.out.println(" Bowler of team " + teamName + " : " + player.getName());
				}

				System.out.println();
			}
		}

		// ---------------- 2025 ----------------
		Map<String, List<Player>> teams2025 = new HashMap<>();
		teams2025.put("RCB", Arrays.asList(new Player("Virat Kohli", 18, "RCB", 4500, 16),
				new Player("Faf du Plessis", 13, "RCB", 3200, 5), new Player("Glenn Maxwell", 32, "RCB", 2100, 12),
				new Player("Rajat Patidar", 12, "RCB", 950, 0), new Player("Dinesh Karthik", 19, "RCB", 4400, 0),
				new Player("Wanindu Hasaranga", 49, "RCB", 700, 65), new Player("Harshal Patel", 9, "RCB", 400, 100),
				new Player("Mohammed Siraj", 73, "RCB", 150, 95), new Player("Josh Hazlewood", 11, "RCB", 80, 75),
				new Player("Mahipal Lomror", 7, "RCB", 500, 15), new Player("Anuj Rawat", 1, "RCB", 300, 0)));
		teams2025.put("CSK", Arrays.asList(new Player("MS Dhoni", 7, "CSK", 5000, 0),
				new Player("Ravindra Jadeja", 8, "CSK", 2500, 150), new Player("Ruturaj Gaikwad", 31, "CSK", 2000, 0),
				new Player("Shivam Dube", 25, "CSK", 1400, 20), new Player("Moeen Ali", 18, "CSK", 1600, 30),
				new Player("Devon Conway", 88, "CSK", 1200, 0), new Player("Ben Stokes", 55, "CSK", 2800, 50),
				new Player("Deepak Chahar", 90, "CSK", 600, 80), new Player("Matheesa Pathirana", 81, "CSK", 100, 40),
				new Player("Tushar Deshpande", 70, "CSK", 70, 40), new Player("Ambati Rayudu", 9, "CSK", 4500, 0)));
		teams2025.put("MI", Arrays.asList(new Player("Rohit Sharma", 45, "MI", 5000, 0),
				new Player("Suryakumar Yadav", 63, "MI", 3500, 0), new Player("Ishan Kishan", 23, "MI", 2000, 0),
				new Player("Tilak Varma", 9, "MI", 8000, 0), new Player("Cameron Green", 42, "MI", 900, 20),
				new Player("Tim David", 21, "MI", 1100, 0), new Player("Hardik Pandya", 33, "MI", 20000, 50),
				new Player("Jasprit Bumrah", 93, "MI", 100, 120), new Player("Piyush Chawla", 11, "MI", 500, 120),
				new Player("Arjun Tendulkar", 24, "MI", 70, 15), new Player("Tristan Stubbs", 30, "MI", 400, 0)));
		teams2025.put("PBKS", Arrays.asList(new Player("Shikhar Dhawan", 42, "PBKS", 6500, 0),
				new Player("Kagiso Rabada", 25, "PBKS", 200, 110), new Player("Sam Curran", 58, "PBKS", 1500, 70),
				new Player("Liam Livingstone", 7, "PBKS", 1300, 25), new Player("Jitesh Sharma", 99, "PBKS", 12000, 0),
				new Player("Jonny Bairstow", 51, "PBKS", 1900, 0), new Player("Shahrukh Khan", 17, "PBKS", 10700, 7),
				new Player("Harpreet Brar", 95, "PBKS", 500, 30), new Player("Rahul Chahar", 28, "PBKS", 250, 75),
				new Player("Arshdeep Singh", 2, "PBKS", 150, 85), new Player("Rishi Dhawan", 19, "PBKS", 500, 40)));
		iplData.put(2025, teams2025);

		int year2 = 2025;

		if (teams2023 != null) {
			System.out.println("====================== Teams in IPL " + year2 + " ======================");
			System.out.println();

			for (Map.Entry<String, List<Player>> teamEntry : teams2025.entrySet()) {
				String teamName = teamEntry.getKey();

				System.out.println("======================== Team: " + teamName + " ============================");
				System.out.println();

				List<Player> batsmen = new ArrayList<>();
				List<Player> bowlers = new ArrayList<>();

				for (Player p : teamEntry.getValue()) {
					System.out.printf("%-20s %-10d %-10s %-10d %-10d%n", p.getName(), p.getJnumber(), p.getTname(),
							p.getRuns(), p.getWickets());

					if (p.getRuns() > 2000) {
						batsmen.add(p);
					}
					if (p.getWickets() > 30) {
						bowlers.add(p);
					}
				}

				System.out.println();

				for (Player player : batsmen) {
					System.out.println(" Batsman of team " + teamName + " : " + player.getName());
				}

				System.out.println();

				for (Player player : bowlers) {
					System.out.println(" Bowler of team " + teamName + " : " + player.getName());
				}

				System.out.println();
			}
		}

//		// ---------------- Print All ----------------
//		for (Map.Entry<Integer, Map<String, List<Player>>> yearEntry : iplData.entrySet()) {
//			int year = yearEntry.getKey();
//			System.out.println("====================== Teams in IPL " + year + " ======================");
//			System.out.println();
//			for (Map.Entry<String, List<Player>> teamEntry : yearEntry.getValue().entrySet()) {
//				System.out.println(
//						"======================== Team: " + teamEntry.getKey() + " ============================");
//				System.out.println();
//				for (Player p : teamEntry.getValue()) {
//					System.out.printf("%-20s %-10d %-10s %-10d %-10d%n", p.getName(), p.getJnumber(), p.getTname(),
//							p.getRuns(), p.getWickets());
//				}
//				System.out.println();
//			}
//		}

	}

}
