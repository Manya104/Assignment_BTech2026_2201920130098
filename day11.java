interface Task {

    void execute();

}



class Robot {

    String name;



    Robot(String name) {

        this.name = name;

    }



    public void performAction() {

        System.out.println(name + " is performing an action.");

    }



    class Arm {

        public void pickItem() {

            System.out.println(name + " arm picking an item.");

        }

    }



    static class Processor {

        public static void process() {

            System.out.println("Processor analyzing the data.");

        }

    }



    public void manageSensors() {

        class Sensor {

            public void sense() {

                System.out.println(name + " sensor detecting obstacles.");

            }

        }

        Sensor sensor = new Sensor();

        sensor.sense();

    }



    public void executeTask() {

        Task task = new Task() {

            public void execute() {

                System.out.println(name + " executing a custom task.");

            }

        };

        task.execute();

    }

}



