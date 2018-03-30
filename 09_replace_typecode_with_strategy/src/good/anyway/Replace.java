package good.anyway;

public class Replace {
    public static void main(String[] args) {
        Logger logger = new Logger();

        logger.log("#0");
        logger.start();

        logger.log("#1");
        logger.start();

        logger.log("#2");
        logger.stop();

        logger.log("#3");
        logger.stop();

        logger.log("#4");



        logger = new LoggerAfter();

        logger.log("#0");
        logger.start();

        logger.log("#1");
        logger.start();

        logger.log("#2");
        logger.stop();

        logger.log("#3");
        logger.stop();

        logger.log("#4");
    }
}
