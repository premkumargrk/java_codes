// enum Day {
//     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
// }

// public class Enum {
//     public static void main(String[] args) {
//         Day today = Day.SATURDAY;

//         switch (today) {
//             case MONDAY:
//                 System.out.println("Start of the week!");
//                 break;
//             case FRIDAY:
//                 System.out.println("Weekend is near!");
//                 break;
//             case SATURDAY:
//             case SUNDAY:
//                 System.out.println("It's the weekend!");
//                 break;
//             default:
//                 System.out.println("Midweek hustle!");
//         }
//     }
// }



// enum Level {
//     LOW(1), MEDIUM(2), HIGH(3);

//     private int levelCode; // Field

//     // Constructor
//     Level(int levelCode) {
//         this.levelCode = levelCode;
//     }

//     // Getter
//     public int getLevelCode() {
//         return levelCode;
//     }
// }

// public class Enum {
//     public static void main(String[] args) {
//         Level lvl = Level.HIGH;
//         System.out.println("Level: " + lvl);
//         System.out.println("Code: " + lvl.getLevelCode());
//     }
// }


// enum Signal {
//     RED {
//         @Override
//         public String action() {
//             return "STOP";
//         }
//     },
//     YELLOW {
//         @Override
//         public String action() {
//             return "SLOW DOWN";
//         }
//     },
//     GREEN {
//         @Override
//         public String action() {
//             return "GO";
//         }
//     };

//     // Abstract method to be implemented by each constant
//     public abstract String action();
// }

// public class Enum {
//     public static void main(String[] args) {
//         for (Signal s : Signal.values()) {
//             System.out.println(s + " -> " + s.action());
//         }
//     }
// }


enum Planet {
    MERCURY(3.3), EARTH(7.0), MARS(6.4);

    private double mass;

    Planet(double mass) {
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }

    // Static method
    public static Planet getHeaviestPlanet() {
        Planet heaviest = null;
        for (Planet p : Planet.values()) {
            if (heaviest == null || p.mass > heaviest.mass) {
                heaviest = p;
            }
        }
        return heaviest;
    }
}

public class Enum {
    public static void main(String[] args) {
        System.out.println("Heaviest planet: " + Planet.getHeaviestPlanet());
    }
}
