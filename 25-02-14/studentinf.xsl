<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
version="1.0">
<xsl:output method="html"/>
<xsl:template match="/">
<html>
<body>
<table align="center" cellspacing="5" cellpadding="10">
<caption>STUDENTS INFORMATION</caption>
<tr bgcolor="light brown ">
<th>Name</th>
<th>RollNo</th>
<th>Year</th>
<th>Batch</th>
<th>Branch</th>
<th>Address</th>
<th>Contact_No</th>
</tr>
<xsl:for-each select="students/student">
<tr>
<td> <xsl:value-of select="Name"/></td>
<td> <xsl:value-of select="Rollno"/></td>
<td> <xsl:value-of select="Year"/></td>
<td> <xsl:value-of select="Batch"/></td>
<td> <xsl:value-of select="Branch"/></td>
<td> <xsl:value-of select="Address"/></td>
<td> <xsl:value-of select="Contact_No"/></td>
</tr>
</xsl:for-each>
</table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>
