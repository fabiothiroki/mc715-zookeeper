import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Random;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.data.Stat;

public class Connect implements Watcher{

	static ZooKeeper zk = null;

	public Connect(){ System.out.println("Starting ZK:");
        String host = "cluster1.lab.ic.unicamp.br:35858";

		try {
        	ZooKeeper zk = new ZooKeeper(host, 3000, this);
			System.out.println("Starting ZK:");
		} catch (IOException e) {
            System.out.println(e.toString());
        	zk = null;
        }
    }

	public void process(WatchedEvent event) {
	}

    public static void main(String[] args) {
        

		//ZooKeeper zk = new ZooKeeper(host, 3000, new Watcher());

		Connect c = new Connect();

		//ZooKeeper(String host, int sessionTimeout, Watcher watcher) 
		

		//String path = "/mc715/" + args[0];
		//ZooKeeper zk = new ZooKeeper(host, 3000,this);

		//String createdPath = zk.create(path, null,
              //ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
    }

}

