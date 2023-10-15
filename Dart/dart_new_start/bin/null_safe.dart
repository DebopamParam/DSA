
void driveTwoSeaterCar(String driver , [String? passenger] )
{
    if(passenger == null)
    {
      print("$driver will drive alone.");
    }
    else
    {
      print("$driver will have a passanger $passenger.");
    }
}

void show_string(String s)
{
  print(s.toUpperCase());
}

bool isEmptyList(Object obj)
{
  if(obj is! List)
    {
      return false;
    }
  else
    {
      return obj.isEmpty;
      // return (obj as List).isEmpty
    }
}

void main(List<String> args)
{
  driveTwoSeaterCar("Param","Chaitra");

  Object obj = "Hello I am Param";
  show_string(obj as String);


  var list = <int>[];
  print(isEmptyList(list));


}