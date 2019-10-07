package com.handtruth.lessons.lesson5.task3;

import com.handtruth.lessons.utils.TextGenerator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TextFileParseTest {

    private static TextFileParse textFileParse;

    @BeforeAll
    static void setUp() {
        textFileParse = new TextFileParse();
    }


    @Test
    @Tag("Normal")
    void parsePhoneNumber() {
        assertTrue(textFileParse.parsePhoneNumber("+7 (928) 000-22-31"));
        assertTrue(textFileParse.parsePhoneNumber("+8 (800) 555-35-35"));
        assertTrue(textFileParse.parsePhoneNumber("+807 (000) 328-07-39"));
        assertFalse(textFileParse.parsePhoneNumber("+42 (00) 328-07-39"));
        assertFalse(textFileParse.parsePhoneNumber("+6 (778) 32-07-69"));
        assertFalse(textFileParse.parsePhoneNumber("+6 (778) 3220769"));
    }

    @Test
    @Tag("Hard")
    void parseMails(@TempDir File tempDir) throws IOException {
        // need to be rewritten
        File file = Paths.get("src", "test", "resources", "lesson5", "mail_test_empty").toFile();
        assertEquals(new ArrayList<String>(), textFileParse.parseMails(file.getAbsolutePath()));

        File testFile2 = new File(tempDir, "test_tmp");
        TextGenerator textGenerator = new TextGenerator();
        assertEquals(textGenerator.generateTestMailFile(testFile2), textFileParse.parseMails(testFile2.getPath()));
    }

    @Test
    @Tag("Hard")
    void countWords() {
        File file = Paths.get("src", "test", "resources", "lesson5", "count_w_test1").toFile();
        assertEquals(Arrays.asList(6, 6, 7, 8, 9), textFileParse.countWords(file.getAbsolutePath()));
    }

    @Test
    @Tag("Normal")
    void rewriteFile(@TempDir File tempDir) throws IOException {
        File file = Paths.get("src", "test", "resources", "lesson5", "rewrite_file_test").toFile();
        File copyFile = new File(tempDir, "copy");
        if (!copyFile.createNewFile()){
            throw new IOException("some weird shit");
        }
        textFileParse.rewriteFile(file.getAbsolutePath(), copyFile.getAbsolutePath());

        byte[] f1 = Files.readAllBytes(file.toPath());
        byte[] f2 = Files.readAllBytes(copyFile.toPath());

        assertEquals(f1, f2);
    }


}