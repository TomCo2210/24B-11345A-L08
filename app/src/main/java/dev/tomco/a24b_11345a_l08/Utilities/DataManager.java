package dev.tomco.a24b_11345a_l08.Utilities;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

import dev.tomco.a24b_11345a_l08.Models.Movie;


public class DataManager {

    public static ArrayList<Movie> getMovies() {
        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie()
                .setName("Wonka")
                .setGenre(new ArrayList<>(Arrays.asList("Comedy", "Family", "Fantasy")))
                .setActors(new ArrayList<>(Arrays.asList("Timothée Chalamet", "Calah Lane", "Keegan-Michael Key", "Hugh Grant")))
                .setLength(117)
                .setPoster("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/qhb1qOilapbapxWQn9jtRCMwXJF.jpg")
                .setOverview("Willy Wonka - chock-full of ideas and determined to change the world one delectable bite at a time - is proof that the best things in life begin with a dream, and if you're lucky enough to meet Willy Wonka, anything is possible.")
                .setRating(7.2f)
                .setReleaseDate(LocalDate.parse("13/12/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

        movies.add(new Movie()
                .setName("Deadpool & Wolverine")
                .setGenre(new ArrayList<>(Arrays.asList("Action", "Comedy", "Science Fiction")))
                .setActors(new ArrayList<>(Arrays.asList("Ryan Reynolds", "Hugh Jackman", "Morena Baccarin", "Emma Corrin")))
                .setLength(119)
                .setPoster("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/uxBHXaoOvAwy4NpPpP7nNx2rXYQ.jpg")
                .setOverview("Third entry in the \"Deadpool\" franchise. Plot TBA.")
                .setRating(0.0f)
                .setReleaseDate(LocalDate.parse("25/07/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

        movies.add(new Movie()
                .setName("The Marvels")
                .setGenre(new ArrayList<>(Arrays.asList("Science Fiction", "Adventure", "Action")))
                .setActors(new ArrayList<>(Arrays.asList("Brie Larson", "Teyonah Parris", "Iman Vellani", "Samuel L. Jackson")))
                .setLength(105)
                .setPoster("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/9GBhzXMFjgcZ3FdR9w3bUMMTps5.jpg")
                .setOverview("Carol Danvers, aka Captain Marvel, has reclaimed her identity from the tyrannical Kree and taken revenge on the Supreme Intelligence. But unintended consequences see Carol shouldering the burden of a destabilized universe. When her duties send her to an anomalous wormhole linked to a Kree revolutionary, her powers become entangled with that of Jersey City super-fan Kamala Khan, aka Ms. Marvel, and Carol’s estranged niece, now S.A.B.E.R. astronaut Captain Monica Rambeau. Together, this unlikely trio must team up and learn to work in concert to save the universe.")
                .setRating(6.3f)
                .setReleaseDate(LocalDate.parse("16/11/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

        movies.add(new Movie()
                .setName("Aquaman and the Lost Kingdom")
                .setGenre(new ArrayList<>(Arrays.asList("Action", "Adventure", "Fantasy")))
                .setActors(new ArrayList<>(Arrays.asList("Jason Momoa", "Patrick Wilson", "Yahya Abdul-Mateen II", "Nicole Kidman")))
                .setLength(124)
                .setPoster("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7lTnXOy0iNtBAdRP3TZvaKJ77F6.jpg")
                .setOverview("Black Manta seeks revenge on Aquaman for his father's death. Wielding the Black Trident's power, he becomes a formidable foe. To defend Atlantis, Aquaman forges an alliance with his imprisoned brother. They must protect the kingdom.")
                .setRating(6.9f)
                .setReleaseDate(LocalDate.parse("21/12/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

        movies.add(new Movie()
                .setName("The Hunger Games: The Ballad of Songbirds & Snakes")
                .setGenre(new ArrayList<>(Arrays.asList("Drama", "Science Fiction", "Action")))
                .setActors(new ArrayList<>(Arrays.asList("Tom Blyth", "Rachel Zegler", "Hunter Schafer", "Peter Dinklage")))
                .setLength(157)
                .setPoster("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/mBaXZ95R2OxueZhvQbcEWy2DqyO.jpg")
                .setOverview("64 years before he becomes the tyrannical president of Panem, Coriolanus Snow sees a chance for a change in fortunes when he mentors Lucy Gray Baird, the female tribute from District 12.")
                .setRating(7.2f)
                .setReleaseDate(LocalDate.parse("07/12/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

        movies.add(new Movie()
                .setName("Oppenheimer")
                .setGenre(new ArrayList<>(Arrays.asList("Drama", "History")))
                .setActors(new ArrayList<>(Arrays.asList("Cillian Murphy", "Emily Blunt", "Matt Damon", "Robert Downey Jr.")))
                .setLength(181)
                .setPoster("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/ptpr0kGAckfQkJeJIt8st5dglvd.jpg")
                .setOverview("The story of J. Robert Oppenheimer's role in the development of the atomic bomb during World War II.")
                .setRating(8.1f)
                .setReleaseDate(LocalDate.parse("20/07/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

        movies.add(new Movie()
                .setName("Guardians of the Galaxy Vol. 3")
                .setGenre(new ArrayList<>(Arrays.asList("Science Fiction", "Adventure", "Action")))
                .setActors(new ArrayList<>(Arrays.asList("Chris Pratt", "Zoe Saldaña", "Dave Bautista", "Karen Gillan")))
                .setLength(150)
                .setPoster("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/r2J02Z2OpNTctfOSN1Ydgii51I3.jpg")
                .setOverview("Peter Quill, still reeling from the loss of Gamora, must rally his team around him to defend the universe along with protecting one of their own. A mission that, if not completed successfully, could quite possibly lead to the end of the Guardians as we know them.")
                .setRating(8.0f)
                .setReleaseDate(LocalDate.parse("03/05/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

        movies.add(new Movie()
                .setName("The Iron Claw")
                .setGenre(new ArrayList<>(Arrays.asList("History", "Drama")))
                .setActors(new ArrayList<>(Arrays.asList("Zac Efron", "Jeremy Allen White", "Harris Dickinson", "Maura Tierney")))
                .setLength(132)
                .setPoster("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/nfs7DCYhgrEIgxKYbITHTzKsggf.jpg")
                .setOverview("The true story of the inseparable Von Erich brothers, who made history in the intensely competitive world of professional wrestling in the early 1980s. Through tragedy and triumph, under the shadow of their domineering father and coach, the brothers seek larger-than-life immortality on the biggest stage in sports.")
                .setRating(7.5f)
                .setReleaseDate(LocalDate.parse("11/01/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

        movies.add(new Movie()
                .setName("Elemental")
                .setGenre(new ArrayList<>(Arrays.asList("Animation", "Comedy", "Family", "Fantasy", "Romance", "Adventure")))
                .setActors(new ArrayList<>(Arrays.asList("Leah Lewis", "Mamoudou Athie", "Ronnie del Carmen", "Shila Ommi")))
                .setLength(102)
                .setPoster("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4Y1WNkd88JXmGfhtWR7dmDAo1T2.jpg")
                .setOverview("In a city where fire, water, land and air residents live together, a fiery young woman and a go-with-the-flow guy will discover something elemental: how much they have in common.")
                .setRating(7.7f)
                .setReleaseDate(LocalDate.parse("15/06/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

        movies.add(new Movie()
                .setName("The Flash")
                .setGenre(new ArrayList<>(Arrays.asList("Action", "Adventure", "Science Fiction")))
                .setActors(new ArrayList<>(Arrays.asList("Ezra Miller", "Sasha Calle", "Michael Keaton", "Michael Shannon")))
                .setLength(144)
                .setPoster("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/rktDFPbfHfUbArZ6OOOKsXcv0Bm.jpg")
                .setOverview("When his attempt to save his family inadvertently alters the future, Barry Allen becomes trapped in a reality in which General Zod has returned and there are no Super Heroes to turn to. In order to save the world that he is in and return to the future that he knows, Barry's only hope is to race for his life. But will making the ultimate sacrifice be enough to reset the universe?")
                .setRating(6.8f)
                .setReleaseDate(LocalDate.parse("14/06/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

        movies.add(new Movie()
                .setName("Barbie")
                .setGenre(new ArrayList<>(Arrays.asList("Comedy", "Adventure")))
                .setActors(new ArrayList<>(Arrays.asList("Margot Robbie", "Ryan Gosling", "America Ferrera", "Kate McKinnon")))
                .setLength(114)
                .setPoster("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/iuFNMS8U5cb6xfzi51Dbkovj7vM.jpg")
                .setOverview("Barbie and Ken are having the time of their lives in the colorful and seemingly perfect world of Barbie Land. However, when they get a chance to go to the real world, they soon discover the joys and perils of living among humans.")
                .setRating(7.1f)
                .setReleaseDate(LocalDate.parse("20/07/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

        movies.add(new Movie()
                .setName("Argylle")
                .setGenre(new ArrayList<>(Arrays.asList("Comedy", "Action", "Crime")))
                .setActors(new ArrayList<>(Arrays.asList("Bryce Dallas Howard", "Henry Cavill", "Bryan Cranston", "Catherine O'Hara")))
                .setLength(139)
                .setPoster("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/siduVKgOnABO4WH4lOwPQwaGwJp.jpg")
                .setOverview("When the plots of reclusive author Elly Conway's fictional espionage novels begin to mirror the covert actions of a real-life spy organization, quiet evenings at home become a thing of the past. Accompanied by her cat Alfie and Aiden, a cat-allergic spy, Elly races across the world to stay one step ahead of the killers as the line between Conway's fictional world and her real one begins to blur.")
                .setRating(6.2f)
                .setReleaseDate(LocalDate.parse("01/02/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

        movies.add(new Movie()
                .setName("Gran Turismo")
                .setGenre(new ArrayList<>(Arrays.asList("Adventure", "Action", "Drama")))
                .setActors(new ArrayList<>(Arrays.asList("Archie Madekwe", "David Harbour", "Orlando Bloom", "Darren Barnet")))
                .setLength(135)
                .setPoster("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/51tqzRtKMMZEYUpSYkrUE7v9ehm.jpg")
                .setOverview("The ultimate wish-fulfillment tale of a teenage Gran Turismo player whose gaming skills won him a series of Nissan competitions to become an actual professional racecar driver.")
                .setRating(7.9f)
                .setReleaseDate(LocalDate.parse("09/08/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

        movies.add(new Movie()
                .setName("גן קופים")
                .setGenre(new ArrayList<>(Arrays.asList("Drama", "Comedy")))
                .setActors(new ArrayList<>(Arrays.asList("אדיר מילר", "סוזנה פפיאן", "שני כהן", "יניב ביטון")))
                .setLength(121)
                .setPoster("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/eQo3U1EIreDefbEmlqa9hiUQDcw.jpg")
                .setOverview("סופר ישראלי שספריו זכו להצלחה גדולה בשנות ה-60 ומאז הקריירה שלו בדעיכה מזהה שזוהי שעת הכושר לצאת למלחמה על מקומו הראוי בקאנון הספרות הישראלי. הוא רוקם תוכנית מתוחכמת אך לא ממש מוסרית. אל מערבולת המזימה רבת התהפוכות שלו נסחפים אלמנה חייכנית, קיבוצניק שנושא עימו סוד גדול, שחקנית צעירה אך כושלת, מבקר ספרות חד לשון, במאי קולנוע איטלקי הנושא סוד משלו ומפיקה צעירה ואמביציוזית. המפגש הגורלי בין שלל הדמויות הססגוניות, ישנה לעד את מהלך חייו של הסופר ושל כל אחד מהדמויות האחרות")
                .setRating(6.8f)
                .setReleaseDate(LocalDate.parse("28/09/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

        return movies;
    }
}
