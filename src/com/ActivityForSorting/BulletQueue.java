
package com.ActivityForSorting;
class Bullet {
    int bulletId;
    int damage;
    Bullet next;
 
    Bullet(int bulletId, int damage) {
        this.bulletId = bulletId;
        this.damage = damage;
        this.next = null;
    }
}
 
class BulletQueue {
    private Bullet front, rear;
 
    BulletQueue() {
        this.front = this.rear = null;
    }
 
    boolean isEmpty() {
        return front == null;
    }
 
    void enqueue(int bulletId, int damage) {
        Bullet newBullet = new Bullet(bulletId, damage);
        if (rear != null) {
            rear.next = newBullet;
        }
        rear = newBullet;
        if (front == null) {
            front = newBullet;
        }
    }
 
    Bullet dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Reload required.");
            return null;
        }
        Bullet firedBullet = front;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return firedBullet;
    }
 
    void reload(int[][] bullets) {
        for (int[] bullet : bullets) {
            enqueue(bullet[0], bullet[1]);
        }
    }
 
    public static void main(String[] args) {
        BulletQueue queue = new BulletQueue();
        queue.reload(new int[][]{{1, 10}, {2, 10}, {3, 10}, {4, 10}, {5, 10}});
 
        while (!queue.isEmpty()) {
            Bullet bullet = queue.dequeue();
            if (bullet != null) {
                System.out.println("Fired Bullet " + bullet.bulletId + " (Damage: " + bullet.damage + ")");
            }
        }
 
        // Reloading
        queue.reload(new int[][]{{6, 10}, {7, 10}, {8, 10}});
 
        while (!queue.isEmpty()) {
            Bullet bullet = queue.dequeue();
            if (bullet != null) {
                System.out.println("Fired Bullet " + bullet.bulletId + " (Damage: " + bullet.damage + ")");
            }
        }
    }
}
 