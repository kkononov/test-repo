package test;

public class Test {

  private final static String PREDICTION_DATA_COLUMN = "predictionData";
  private final static String NOT_MODIFIED_COLUMN = "theSame";

  private final Table<String, String> myDbTable; // new commented line
  private final Serializer<Map<String, Double>> myPredictionDataSerializer =
    new MapSerializer<String, Double>(StringSerializer.Instance);

  private void function1() {
    routes.add(new StaticFileServerHandler(UpsourceConfigurationStrategy.Debug,
        /* comment */new File(absoluteContentRoot, "api_doc"),
        webContext.get("/§");/* one more */
  }

  @Override
  private void function2() {
    int longNameVariable = 0; // new // existing
    /* long long long */ int a; /* new comment */
    final String literal = "this literal written long";
    final String lit;
    lit = "literal and " + /* comment and */" is literal";
    /*
     ***/int inline;
         final String lineString;
         float anotherInline;/***
     *
     */
  }
}
/* 1
 * 2
 * 3
 * 4
 * 5 (more added in this block)
 * 6
 * 7
 */
