package codinginsights.practice.Flyweight;

import java.util.HashMap;

/**
 * Created by elefher on 7/23/17.
 */

public class EnemyFactory {

  private static HashMap<String, Enemy> enemies = new HashMap<String, Enemy>();
  
  public static Enemy getEnemy(String enemyType){
	Enemy enemy = enemies.get(enemyType);
	
	if (enemy == null) {
	  switch (enemyType) {
		case "Alpha":
		  enemy = new Wolf(100);
		  enemy.assignWeapon(WeaponType.ShotGun);
		  enemies.put(enemyType, enemy);
		  break;
		case "Beta":
		  enemy = new Wolf(70);
		  enemy.assignWeapon(WeaponType.Pistol);
		  enemies.put(enemyType, enemy);
		  break;
		case "Delta":
		  enemy = new Wolf(50);
		  enemy.assignWeapon(WeaponType.Knife);
		  enemies.put(enemyType, enemy);
		  break;
		default:
		  break;
	  }
	}
	return enemy;
  }
}
