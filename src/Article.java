
import java.nio.file.*;

public class Article {

public String Article;
    public String userInputArticle;

    public Article(String data) {
    this.userInputArticle = data;
    }

    public String []assignArticle(String article){
        String[] splitArticle = article.split(article);
        System.out.println(splitArticle);
        return splitArticle;
    }


    public static String readFileAsString(String fileName)
        throws Exception
    {
        String data = "";
        data = new String(
            Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
 
    public static void main(String[] args) 
    
    throws Exception

    {
        //Read and Print the Center File
        String centerArticleString = readFileAsString("News Articles\\Center.txt");
       
        //System.out.println(centerArticleString);

        System.out.println("******************************************************************");

        //Read and Print the Left File
        String leftArticleString = readFileAsString("News Articles\\Left.txt");
        //System.out.println(leftArticleString);
        
        System.out.println("******************************************************************");

        //Read and Print the Right File
        String rightArticleString = readFileAsString("News Articles\\Right.txt");
        //System.out.println(rightArticleString);


        Article FirstArticle = new Article(centerArticleString);
        String FirstArticleApostrophe = FirstArticle.userInputArticle.replaceAll("[\'’]", "");

        String FirstArticleLowercase = FirstArticleApostrophe.replaceAll("[^a-zA-Z]", " ");
        String FirstArticleClean = FirstArticleLowercase.replaceAll("( )+", " ");

        //Print clean article
        System.out.println(FirstArticleClean);


        //Article SecondArtcle = new Article(leftArticleString);
        //String SecondArticleLowercase = SecondArtcle.userInputArticle.replaceAll("'", " ");
        //SecondArticleLowercase = SecondArticleA

        // Article SecondArticlCleanleftArticleString);
        // String SecondArticleStopWordsRemoved = SecondArticle.userInputArticle.replaceAll("[^a-zA-Z]", "");
        // String SecondArticleRemovedSpaces = SecondArticle.userInputArticle.replaceAll("[^   ]", " ");

        //Article ThirdArticlCleanrightArticleString);
        ///String ThirdArticleStopWordsRemoved = ThirdArticle.userInputArticle.replaceAll("[^a-zA-Z]", "");
        ///String ThirdArticleRemovedSpaces = FirstArticle.userInputArticle.replaceAll("[^   ]", " ");
        
    }
}   
