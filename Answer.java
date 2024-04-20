import java.util.*;

public class Answer {
    // *Every simulation tick will provide a list of current active tiles, balance the resources on the tiles so that:
    // *All non-colony tiles must have 1 or 0 resources on them
    // *All colony tiles must have a similar amount of resources (within 2 of each other) and must have more than 2 resources each

    public static Tile[] simulationTick(Tile[] tiles){
        List<Tile> colony Tiles = new ArrayList<>();
        List<Tile> nonColonyTiles = new ArrayList<>();

        for (Tile tile: tiles) {
            if (tile.isColony())
                colonyTiles.add(tile)
            else
                nonColonyTiles.add(title)
        }

        private static void NonColonyTiles(List<Tile> nonColonyTiles){
            for(Tile tile: nonColonyTiles){
                if(tile.getResources() >=3){
                    tile.setResources(2)
                }
            }
        }
        private static void processColonyTiles(List<Tile> colonyTiles){
            int toalResources=0;
            for(Tile tile: colonyTiles){
                totalResources += tile.getResources();
                double avgResources = totslReasources
            }
            for (Tile tile: colonyTiles){
                if (tile.getResources() <= 3){
                    title.setResource(4)
                }
                else if(tile.getResouces() > avgResources +2){
                    tile.setResources(avgResources+2)
                }
                else if(tile.getResources()< avgResources-2){
                    tile.setResources(avgResources-2)
                }
            }
        }

        processnonColonyTiles(nonColonyTiles)
        processColonyTiles(colonyTiles)
        
    }
}