function ques5(){
//part1
	var listOfObj = [
    { name: 'Ankit', age: 23, salary:10000, dob: '30/6/1998' },
    { name: 'Abhishek', age: 23, salary:10000, dob: '2/7/1998' },
    { name: 'Ashish', age: 18, salary:5000, dob: '14/8/2002' },
    { name: 'Prateek', age: 33, salary:4000, dob: '12/4/1998' },
    { name: 'Tushar', age: 33, salary:300, dob: '10/6/1998' }
	];
  console.log('List of employees',listOfObj);

//part 2
var filterOnSalary = listOfObj.filter(function (el) {
  return el.salary > 5000;
});
console.log('filterOnSalary',filterOnSalary);

//part 3
function groupBy(objectArray, property) {
   return objectArray.reduce((acc, obj) => {
      const key = obj[property];
      if (!acc[key]) {
         acc[key] = [];
      }
      acc[key].push(obj);
      return acc;
   }, {});
}
const groupPeople = groupBy(listOfObj, 'age');
console.log('groupPeople',groupPeople);


// part 4
var agesal = listOfObj.filter(function (el) {
  return el.salary < 1000 &&
         el.age > 20;
});
for(x in agesal){
	agesal[x].salary = agesal[x].salary*20;
}
console.log('agesal',agesal);
};