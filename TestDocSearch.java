import static org.junit.Assert.*;
import org.junit.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;

public class TestDocSearch {
	@Test 
	public void testIndex() throws URISyntaxException, IOException {
    Handler h = new Handler("./technical/");
    URI rootPath = new URI("http://localhost/");
    assertEquals("There are 1391 total files to search.", h.handleRequest(rootPath));
	}
	@Test 
	public void testSearch1() throws URISyntaxException, IOException {
    Handler h = new Handler("./technical/");
    URI rootPath = new URI("http://localhost/search?q=Resonance");
    String expect = "Found 2 paths:\n./technical/biomed/ar615.txt\n./technical/plos/journal.pbio.0020150.txt";
    assertEquals(expect, h.handleRequest(rootPath));
	}
    // @Test 
	// public void testSearch2() throws URISyntaxException, IOException {
    // Handler h = new Handler("./technical/");
    // URI rootPath = new URI("http://localhost/search?q=apple");
    // String expect = "Found 14 paths:\\n.\\technical\911report\chapter-8.txt\r\n" + //
    //         ".\\technical\\biomed\\1468-6708-3-10.txt\r\n" + //
    //         ".\\technical\\biomed\\1471-2105-3-12.txt\r\n" + //
    //         ".\\technical\\biomed\\1471-2202-2-5.txt\r\n" + //
    //         ".\\technical\\biomed\\1471-2458-3-11.txt\r\n" + //
    //         ".\\technical\\biomed\\1472-6882-1-10.txt\r\n" + //
    //         ".\\technical\\biomed\\gb-2002-3-10-research0053.txt\r\n" + //
    //         ".\\technical\\biomed\\gb-2002-3-12-research0077.txt\r\n" + //
    //         ".\\technical\\biomed\\gb-2003-4-8-r51.txt\r\n" + //
    //         ".\\technical\\government\\About_LSC\\commission_report.txt\r\n" + //
    //         ".\\technical\\government\\Gen_Account_Office\\Oct15-2001_d0224.txt\r\n" + //
    //         ".\\technical\\government\\Gen_Account_Office\\Testimony_cg00010t.txt\r\n" + //
    //         ".\\technical\\government\\Media\\Law_Schools.txt\r\n" + //
    //         ".\\technical\\plos\\pmed.0010013.txt";
    // assertEquals(expect, h.handleRequest(rootPath));
	// }
}

