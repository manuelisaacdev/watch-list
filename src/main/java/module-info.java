module com.watchlist {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.slf4j;
    requires static lombok;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;

    opens com.watchlist;
    opens com.watchlist.controller;

    exports com.watchlist;
    exports com.watchlist.controller;
}