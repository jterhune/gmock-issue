import org.gmock.GMockTestCase

class CrapTest extends GMockTestCase {
    void test_file() {
        CrapUtility utility = mock(CrapUtility)

        File file1 = mock(File)
        utility.deleteDirectory(file1)

        File file2 = mock(File)
        utility.deleteDirectory(file2)

        play {
            utility.deleteDirectory(file1)
            utility.deleteDirectory(file2)
        }
    }

    void test_uri() {
        CrapUtility mockUtility = mock(CrapUtility)

        URI uri1 = mock(URI)
        mockUtility.deleteUri(uri1)

        URI uri2 = mock(URI)
        mockUtility.deleteUri(uri2)

        play {
            mockUtility.deleteUri(uri1)
            mockUtility.deleteUri(uri2)
        }
    }
}
