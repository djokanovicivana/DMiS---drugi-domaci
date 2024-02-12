# Producer consumer problem - Warehouse

This Java project involves the implementation of classes `Warehouse`, `Producer`, and `Consumer`. Additionally, a new class `Reporter` needs to be implemented to periodically display the content of a given warehouse.

## Classes Overview:

### Warehouse.java

This class represents a warehouse that contains products. It has the following attributes:

- `id`: Unique automatically generated integer identifier.
- `array`: An array to store products.
- `in`: Index for the incoming product.
- `out`: Index for the outgoing product.
- `capacity`: Capacity of the warehouse.
- `state`: Current state of the warehouse.

The class provides methods to `put` (add) and `take` (remove) products from the warehouse.

### Producer.java

This class represents a producer that generates products and puts them into the warehouse. It has the following attributes:

- `id`: Unique automatically generated integer identifier.
- `warehouse`: Warehouse where products are stored.
- `counter`: Counter to keep track of the produced products.
- `minTime`, `maxTime`: Minimum and maximum time intervals between producing products.

The class provides a `run` method where the producer continuously generates products and puts them into the warehouse.

### Consumer.java

This class represents a consumer that takes products from the warehouse. It has the following attributes:

- `id`: Unique automatically generated integer identifier.
- `warehouse`: Warehouse from which products are taken.
- `counter`: Counter to keep track of the consumed products.
- `minTime`, `maxTime`: Minimum and maximum time intervals between consuming products.

The class provides a `run` method where the consumer continuously takes products from the warehouse.

### Reporter.java

This class represents a reporter that periodically displays the content of a given warehouse. It has the following attributes:

- `id`: Unique automatically generated integer identifier.
- `warehouse`: Warehouse whose content will be reported.
- `interval`: Time interval for reporting the content of the warehouse.

The class provides a `run` method where the reporter periodically displays the content of the warehouse at specified intervals.

## Main Program

The main program creates a warehouse with 5 products, 10 producers, 10 consumers, and one reporter. The reporter displays the content of the warehouse every 10 seconds.

## Usage

To run the program, execute the main program file.

