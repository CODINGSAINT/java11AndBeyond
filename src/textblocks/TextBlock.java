package textblocks;

class TextBlock {
    public static void main(String[] args) {
        String htmlWithoutTextBlock = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "   <body>\n" +
                "      <p>This is java example of HTML text block with and without Text block.</p>\n" +
                "   </body>\n" +
                "</html>";
        String htmlWithTextBlock = """
                <!DOCTYPE html>
                <html>
                   <body>
                      <p>This is java example of HTML text block with and without Text block.</p>
                   </body>
                </html>""";
        System.out.println(htmlWithTextBlock);
        System.out.println("====================================================");
        System.out.println(htmlWithoutTextBlock);

        System.out.println("Formatting Text Block ");
        String superHero = """
                {
                    "name":"%s",
                    "prefix":"%s",
                    "suffix":"%s",
                    "power":"%s"
                }
                """;
        System.out.println(String.format(superHero, "Invisible Force",
                "Captain", "Lightening", "Invisible"));
        System.out.println("Very Long String as a single line");
        String veryLongString= """
                Once up a time, there used to be java strings without text blocks,\
                they were difficult to read and comprehend, \
                  then came java 15 and it changed the game""";
        System.out.println(veryLongString);
    }
}