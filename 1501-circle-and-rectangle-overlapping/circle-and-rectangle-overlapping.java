class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        // Find the closest point on the rectangle to the circle's center
        int closestX = Math.max(x1, Math.min(x2, xCenter));
        int closestY = Math.max(y1, Math.min(y2, yCenter));
        
        // Calculate the distance vector components from the circle's center to this closest point
        int distX = xCenter - closestX;
        int distY = yCenter - closestY;
        
        // Check if the squared distance is less than or equal to the squared radius
        return (distX * distX) + (distY * distY) <= (radius * radius);
    }
}