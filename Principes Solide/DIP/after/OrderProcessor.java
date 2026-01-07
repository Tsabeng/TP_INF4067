//package dip.after;

interface Database {
    void save(String data);
}

class MySQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}

class MongoDBDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving to MongoDB: " + data);
    }
}

public class OrderProcessor {
    private Database database;

    public OrderProcessor(Database database) {
        this.database = database;
    }

    public void processOrder(String order) {
        database.save(order);
    }

    public static void main(String[] args) {
        Database db1 = new MySQLDatabase();
        OrderProcessor order1 = new OrderProcessor(db1);
        order1.processOrder("'Commande #1001'");

        Database db2 = new MongoDBDatabase();
        OrderProcessor order2 = new OrderProcessor(db2);
        order2.processOrder("'Commande #1002'");
    }
}
