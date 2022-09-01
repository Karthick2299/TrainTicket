/**
 * 
 */
function travelDateCheck() {
       let date = document.getElementById('travelDate').value;
       let now = new Date();
       let dt1 = Date.parse(now),
       dt2 = Date.parse(date);
       if (dt2 <= dt1) {
            alert("Date must be in the Future");
       }
 }
function dateOfBirthCheck() {
       let date = document.getElementById('travelDate').value;
       let now = new Date();
       let dt1 = Date.parse(now),
       dt2 = Date.parse(date);
       if (dt2 >= dt1) {
            alert("Date must be in the Past");
       }
 }