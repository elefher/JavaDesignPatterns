package codinginsights.practice;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

import javax.swing.JFrame;
import javax.swing.JPanel;

import codinginsights.practice.Decorator.CommonSword;
import codinginsights.practice.Decorator.ExcaliburSword;
import codinginsights.practice.Decorator.Sword;
import codinginsights.practice.DependencyInjection.Player;
import codinginsights.practice.DependencyInjection.PlayerInjection;
import codinginsights.practice.DependencyInjection.PlayerWithBigHead;
import codinginsights.practice.DependencyInjection.PlayerWithRegularHead;
import codinginsights.practice.Factory.ActionFigure;
import codinginsights.practice.Factory.FactoryActionFigure;
import codinginsights.practice.Observer.ClassSubject;
import codinginsights.practice.Observer.StudentObserver;
import codinginsights.practice.Pooling.Dot;
import codinginsights.practice.Pooling.DotPool;
import codinginsights.practice.Pooling.Line;
import codinginsights.practice.Prototype.DotPrototype;
import codinginsights.practice.Prototype.DotSpawner;
import codinginsights.practice.State.GunContext;
import codinginsights.practice.State.ShotGunHasAmmo;
import codinginsights.practice.TemplateMethod.Scenario1;
import codinginsights.practice.TemplateMethod.Scenario2;

/**
 * Created by elefher on 3/10/17.
 */

public class Main extends JPanel {

  public static int W_WIDTH = 400;
  public static int W_HEIGHT = 400;
  private DotPool dPool;
  private ArrayList<Dot> dots;
  private Line line;

  DotPrototype red1;
  DotPrototype red2;
  DotPrototype red3;
  DotPrototype yellow1;
  DotPrototype yellow2;
  DotPrototype yellow3;
  DotPrototype green1;
  DotPrototype green2;
  DotPrototype green3;

  /**
   * A temporary solution until to use Junit
   */

  public Main() {
//	poolingTesting();
//	prototypeTesting();
//	factoryTesting();
//	dependencyInjectionTesting();
//	stateTesting();
//	templateMethodTesting();
//	decoratorTesting();
	observerTesting();
  }

  private void observerTesting(){
	ClassSubject course = new ClassSubject();

	StudentObserver lefteris = new StudentObserver(course, "Lefteris");
	StudentObserver eric = new StudentObserver(course, "Eric");
	StudentObserver jonathan = new StudentObserver(course, "Jonathan");
	StudentObserver alan = new StudentObserver(course, "Alan");

	course.setState(1);
	System.out.println();
	course.setState(2);

	course.dettach(jonathan);
	System.out.println();
	course.setState(3);
  }

  private void decoratorTesting(){
	Sword commonSword = new CommonSword("Common Sword");
	commonSword.attributes();

	System.out.println("");

	Sword excalibur = new ExcaliburSword(commonSword);
	excalibur.attributes();
  }

  private void templateMethodTesting(){
	Scenario1 sc1 = new Scenario1();
	System.out.println("The score from scenario 1 is: " + sc1.computeScore() * 100 + "%");

	Scenario2 sc2 = new Scenario2();
	System.out.println("The score from scenario 2 is: " + sc2.computeScore() * 100 + "%");
  }

  private void stateTesting(){
	GunContext gun = new GunContext();

	gun.fire();
	gun.fire();
	gun.fire();
	gun.fire();
	gun.fire();
	gun.reload(4);
	gun.fire();
	gun.fire();
	gun.fire();
	gun.addBullets(2);
	gun.fire();
	gun.fire();
	gun.fire();
	gun.fire();
	gun.fire();
  }

  private void dependencyInjectionTesting(){
	PlayerInjection playerInj = new PlayerWithBigHead();

	Player player = playerInj.getPlayer();
	player.playerMessage();

	System.out.println();

	playerInj = new PlayerWithRegularHead();
	player = playerInj.getPlayer();
	player.playerMessage();
  }

  private void factoryTesting(){
	ActionFigure figure = FactoryActionFigure.createFigurePunch();
	System.out.println("Action figure without gun created!");
	System.out.print("Figure is shooting : ");
	figure.shoot();
	System.out.println("figure is shooting 3 times : ");
	figure.shoot();
	figure.shoot();
	figure.shoot();

	System.out.println();

	ActionFigure figureGun = FactoryActionFigure.createFigureShotGun();
	System.out.println("Action figure with gun created!");
	System.out.print("Figure with gun is shooting : ");
	figureGun.shoot();
	System.out.print("Figure with gun is shooting 3 times: ");
	figureGun.shoot();
	figureGun.shoot();
	figureGun.shoot();
	System.out.print("Figure with gun is shooting : ");
	figureGun.shoot();
	System.out.print("Figure with gun reloads gun : ");
	figureGun.reload();
	System.out.print("Figure with gun is shooting : ");
	figureGun.shoot();


  }

  private void prototypeTesting() {

	DotSpawner.initialize();

	Random rand = new Random();

	red1 = (DotPrototype) DotSpawner.getDot("RED").clone();
	red1.setPosition(rand.nextInt(W_WIDTH - 20) + 10, rand.nextInt(W_HEIGHT - 20) + 10);
	red2 = (DotPrototype) DotSpawner.getDot("RED").clone();
	red2.setPosition(rand.nextInt(W_WIDTH - 20) + 10, rand.nextInt(W_HEIGHT - 20) + 10);
	red3 = (DotPrototype) DotSpawner.getDot("RED").clone();
	red3.setPosition(rand.nextInt(W_WIDTH - 20) + 10, rand.nextInt(W_HEIGHT - 20) + 10);

	yellow1 = (DotPrototype) DotSpawner.getDot("YELLOW").clone();
	yellow1.setPosition(rand.nextInt(W_WIDTH - 20) + 10, rand.nextInt(W_HEIGHT - 20) + 10);
	yellow2 = (DotPrototype) DotSpawner.getDot("YELLOW").clone();
	yellow2.setPosition(rand.nextInt(W_WIDTH - 20) + 10, rand.nextInt(W_HEIGHT - 20) + 10);
	yellow3 = (DotPrototype) DotSpawner.getDot("YELLOW").clone();
	yellow3.setPosition(rand.nextInt(W_WIDTH - 20) + 10, rand.nextInt(W_HEIGHT - 20) + 10);

	green1 = (DotPrototype) DotSpawner.getDot("GREEN").clone();
	green1.setPosition(rand.nextInt(W_WIDTH - 20) + 10, rand.nextInt(W_HEIGHT - 20) + 10);
	green2 = (DotPrototype) DotSpawner.getDot("GREEN").clone();
	green2.setPosition(rand.nextInt(W_WIDTH - 20) + 10, rand.nextInt(W_HEIGHT - 20) + 10);
	green3 = (DotPrototype) DotSpawner.getDot("GREEN").clone();
	green3.setPosition(rand.nextInt(W_WIDTH - 20) + 10, rand.nextInt(W_HEIGHT - 20) + 10);
  }


  @Override
  public void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g2 = (Graphics2D) g;

	drawDots(g2, red1);
	drawDots(g2, red2);
	drawDots(g2, red3);

	drawDots(g2, yellow1);
	drawDots(g2, yellow2);
	drawDots(g2, yellow3);

	drawDots(g2, green1);
	drawDots(g2, green2);
	drawDots(g2, green3);
  }

  private void drawDots(Graphics2D g2, DotPrototype dot) {
	g2.setPaint(dot.getDotColor());
	g2.fillOval(dot.getX(), dot.getY(), dot.getRadious() * 2, dot.getRadious() * 2);
  }

  private void poolingTesting() {
	dPool = new DotPool(2);
	dots = new ArrayList<Dot>();
	line = new Line();

	System.out.println("Pooling Usage");
	System.out.println("Init Pool Size " + dPool.size());

	dots.add(dPool.get());
	System.out.println("Get One Dot from Pool with UUID = " + dots.get(0).getUUID());
	System.out.println("Pool Size " + dPool.size());

	dots.add(dPool.get());
	System.out.println("Get One Dot from Pool with UUID = " + dots.get(1).getUUID());
	System.out.println("Pool Size " + dPool.size());

	dPool.free(dots.get(1));
	dots.remove(1); // remove the Dot from ArrayList
	System.out.println("Free object with UUID " + dots.get(0).getUUID());
	System.out.println("Pool Size " + dPool.size());

	dots.add(dPool.get());
	System.out.println("Get One Dot from Pool with UUID = " + dots.get(1).getUUID());
	System.out.println("Pool Size " + dPool.size());

	dots.add(dPool.get());
	System.out.println("Get One Dot from Pool with UUID = " + dots.get(2).getUUID());
	System.out.println("Pool Size " + dPool.size());

	System.out.println("Free All Objects");

	int dotsSize = dots.size();
	int i = 0;
	for (i = 0; i < dotsSize; i++) {
	  dPool.free(dots.get(i));
	}

	System.out.println("Now Pool contains " + dPool.size() + " objects");
	dPool.printAllDots();
  }

//  @Override
//  public void paintComponent(Graphics g) {
//	super.paintComponent(g);
//	Graphics2D g2 = (Graphics2D) g;
//
//	g2.setColor(Color.BLACK); // set the color to black
//
//	int poolSize = dPool.size();
//	for (int i = 0; i < poolSize; i++) {
//	  dPool.free(dots.get(i));
//	  Shape shape = dPool.get().getShape();		// get the shape (circle)
//	  g2.draw(shape);							// draw the circle
//	  g2.fill(shape);	 						// fill the circle with color (black)
//	}
//
//	g2.draw(line.getShape());   // draw the line
//  }

  public static void main(String[] arg) {
//	JFrame frame = new JFrame("Prototype Pattern");
//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	frame.setSize(W_WIDTH, W_HEIGHT);
//	frame.getContentPane().add(new Main());
//	frame.setVisible(true);

	Main main = new Main();

//	List names = new ArrayList();
//
//	names.add("Mahesh");
//	names.add("Suresh");
//	names.add("Ramesh");
//	names.add("Naresh");
//	names.add("Kalpesh");
//
//	names.forEach(System.out::println);
//
//	List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//	List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//	System.out.println(filtered.toString());
//
//	List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//	//get list of unique squares
//	List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
//	System.out.println(squaresList.toString());
//	Random random = new Random();
//
//	random.ints().limit(10).forEach(System.out::println);
//
//	numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//
//	IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
//
//	System.out.println("Highest number in List : " + stats.getMax());
//	System.out.println("Lowest number in List : " + stats.getMin());
//	System.out.println("Sum of all numbers : " + stats.getSum());
//	System.out.println("Average of all numbers : " + stats.getAverage());
//
//	Integer value1 = null;
//	Integer value2 = new Integer(10);
//
//	//Optional.ofNullable - allows passed parameter to be null.
//	Optional<Integer> a = Optional.ofNullable(value1);
//
//	//Optional.of - throws NullPointerException if passed parameter is null
//	Optional<Integer> b = Optional.of(value2);
//	main.testOptional(a, b);
  }

  public void testOptional(Optional<Integer> a, Optional<Integer> b){

	//Optional.isPresent - checks the value is present or not

	System.out.println("First parameter is present: " + a.isPresent());
	System.out.println("Second parameter is present: " + b.isPresent());

	//Optional.orElse - returns the value if present otherwise returns
	//the default value passed.
	Integer value1 = a.orElse(new Integer(1));

	//Optional.get - gets the value, value should be present
	Integer value2 = b.get();

	System.out.println("Optional test outcome is = " + (value1 + value2));
  }
}
