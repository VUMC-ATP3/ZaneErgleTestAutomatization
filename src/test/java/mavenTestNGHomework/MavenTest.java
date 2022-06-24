package mavenTestNGHomework;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class MavenTest {

    public static void main(String[] args) throws IOException {
        String asciArt = FigletFont.convertOneLine("Zane Ergle");
        System.out.println(asciArt);
    }
}
