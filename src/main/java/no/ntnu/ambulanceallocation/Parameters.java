package no.ntnu.ambulanceallocation;

import java.time.LocalDateTime;
import java.time.LocalTime;

import no.ntnu.ambulanceallocation.optimization.initializer.Initializer;
import no.ntnu.ambulanceallocation.optimization.initializer.Random;
import no.ntnu.ambulanceallocation.simulation.DispatchPolicy;

public final class Parameters {
    // General
    public final static int RUNS = 15;
    public final static int MAX_RUNNING_TIME = (int) (4.0 * 60); // minutes

    // Simulation
    public static final int BUFFER_SIZE = 4; // hours
    public static final LocalDateTime START_DATE_TIME = LocalDateTime.of(2017, 8, 7, 0, 0, 0);
    public static final LocalDateTime END_DATE_TIME = LocalDateTime.of(2017, 8, 14, 0, 0, 0);

    public static final int NUMBER_OF_AMBULANCES_DAY = 45;
    public static final int NUMBER_OF_AMBULANCES_NIGHT = 29;

    public static final LocalTime DAY_SHIFT_START = LocalTime.of(8, 0);
    public static final LocalTime NIGHT_SHIFT_START = LocalTime.of(20, 0);

    public static final DispatchPolicy DISPATCH_POLICY = DispatchPolicy.Fastest;
    public static final int UPDATE_LOCATION_PERIOD = 5; // minutes

    // Simulation visualization
    public static final int GUI_UPDATE_INTERVAL = 400; // every x milliseconds

    // Route calculation
    public static final int COORDINATE_NEIGHBOR_DISTANCE = 8000; // meters

    // SLS
    public static final int MAX_TRIES = 999;
    public static final double RESTART_PROBABILITY = 0.025;
    public static final double NOISE_PROBABILITY = 0.8;

    // Genetic & Memetic Algorithm
    public static final Initializer INITIALIZER = new Random();
    public static final int GENERATIONS = 999;
    public static final int POPULATION_SIZE = 30;
    public static final int ELITE_SIZE = 4;
    public static final int TOURNAMENT_SIZE = 5;

    public static final double CROSSOVER_PROBABILITY = 0.2;
    public static final double MUTATION_PROBABILITY = 0.05;
    public static final double IMPROVE_PROBABILITY = 0.25;

}
