function AreaOfCircle(radius) {
    return 3.14*radius*radius;
}
    
    const radius = prompt('Please enter the radius of the circle: ');
    const value = AreaOfCircle(radius);

window.onload = function(){
    document.getElementById('output').innerHTML = value;
};