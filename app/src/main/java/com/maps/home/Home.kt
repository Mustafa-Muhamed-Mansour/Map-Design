package com.maps.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.rounded.Done
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.maps.R
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeMap() {

    val sheetState = rememberModalBottomSheetState()
    val showBottomSheet by remember {
        mutableStateOf(false)
    }
    val stroke = Stroke(
        width = 2f,
        pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f), 0f)
    )

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.map),
            contentDescription = "image map",
            contentScale = ContentScale.FillBounds
        )


        if (showBottomSheet.not()) {

            ShowBottomSheet(sheetState, showBottomSheet, stroke)

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShowBottomSheet(sheetState: SheetState, showBottomSheet: Boolean, stroke: Stroke) {

    ModalBottomSheet(
        onDismissRequest = { showBottomSheet.not() },
        sheetState = sheetState,
        containerColor = Color.White
    ) {

        Row {
            Row(
                modifier = Modifier
                    .weight(1f),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.palestine),
                    contentDescription = "image palestine",
                    modifier = Modifier
                        .padding(start = 5.sdp, top = 0.sdp, end = 3.sdp, bottom = 0.sdp)
                        .wrapContentSize(Alignment.TopCenter)
                )

                Column(
                    modifier = Modifier.padding(3.sdp)
                ) {

                    Text(
                        text = "Palestine freedom",
                        fontSize = 13.ssp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )

                    Text(
                        text = "#01556044",
                        fontSize = 11.ssp,
                        color = Color.Gray
                    )

                }
            }

            Row(
                modifier = Modifier
                    .padding(3.sdp)
                    .weight(1f),
                horizontalArrangement = Arrangement.End
            ) {

                Column(
                    modifier = Modifier.padding(3.sdp)
                ) {
                    Text(
                        modifier = Modifier.padding(3.sdp),
                        text = "2",
                        fontSize = 15.ssp,
                        color = Color.Red,
                        fontWeight = FontWeight.Bold
                    )

                    Row {
                        Text(
                            modifier = Modifier.padding(3.sdp),
                            text = "Freedom Code",
                            fontSize = 10.ssp,
                            color = Color.Gray
                        )

                        Icon(
                            modifier = Modifier
                                .padding(3.sdp)
                                .rotate(180f),
                            painter = painterResource(id = R.drawable.exclamation),
                            contentDescription = "image exclamation",
                            tint = Color.Blue,
                        )

                    }
                }
            }
        }

        LineAfterSection()

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.sdp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                Icons.Rounded.Send,
                contentDescription = "image sent",
                colorFilter = ColorFilter.tint(Color.Red),
                modifier = Modifier
                    .background(color = Color.White)
                    .weight(1f)
            )

            Canvas(
                modifier = Modifier
                    .height(3.sdp)
                    .weight(1f)
                    .padding(1.sdp)
            ) {
                drawRoundRect(color = Color.Red, style = stroke)
            }

            Image(
                Icons.Rounded.ShoppingCart,
                contentDescription = "image shopping",
                colorFilter = ColorFilter.tint(Color.Red),
                modifier = Modifier
                    .background(color = Color.White)
                    .weight(1f)
            )

            Canvas(
                modifier = Modifier
                    .height(3.sdp)
                    .weight(1f)
                    .padding(1.sdp)
            ) {
                drawRoundRect(color = Color.Red, style = stroke)
            }

            Image(
                Icons.Rounded.ShoppingCart,
                contentDescription = "image shopping",
                colorFilter = ColorFilter.tint(Color.Red),
                modifier = Modifier
                    .background(color = Color.White)
                    .weight(1f)
            )

            Canvas(
                modifier = Modifier
                    .height(3.sdp)
                    .weight(2f)
                    .padding(1.sdp)
            ) {
                drawRoundRect(color = Color.Gray, style = stroke)
            }

            Image(
                Icons.Rounded.Done,
                contentDescription = "image Done",
                colorFilter = ColorFilter.tint(Color.Gray),
                modifier = Modifier
                    .background(color = Color.White)
                    .weight(1f)
            )

        }

        LineAfterSection()

        Row(
            modifier = Modifier.padding(
                start = 5.sdp,
                top = 3.sdp,
                end = 3.sdp,
                bottom = 5.sdp
            )
        ) {

            Row(
                modifier = Modifier
                    .padding(3.sdp)
                    .weight(2f),
            ) {

                Column(
                    modifier = Modifier.padding(3.sdp)
                ) {

                    Text(
                        text = "Palestine on the way to freedom",
                        fontSize = 10.ssp,
                        color = Color.Gray
                    )

                    Row(
                        modifier = Modifier.padding(3.sdp)
                    ) {

                        Text(
                            text = "Your order. ETA",
                            fontSize = 10.ssp,
                            color = Color.Gray
                        )

                        Text(
                            text = " 9:41 PM",
                            fontSize = 10.ssp,
                            color = Color.Black
                        )

                    }
                }

            }

            Row(
                modifier = Modifier
                    .padding(3.sdp)
                    .weight(1f),
                horizontalArrangement = Arrangement.End
            ) {
                Box(
                    contentAlignment = Alignment.Center
                ) {

                    CircularProgressIndicator(
                        progress = 0.5f,
                        color = Color(0xffa1c6c0)
                    )

                    Text(
                        text = "5:20",
                        fontSize = 10.ssp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }

        LineAfterSection()

        Row(
            modifier = Modifier.padding(3.sdp)
        ) {

            Row(
                modifier = Modifier
                    .padding(3.sdp)
                    .weight(1f)
            ) {

                Text(
                    modifier = Modifier.padding(
                        start = 5.sdp,
                        top = 0.sdp,
                        end = 0.sdp,
                        bottom = 0.sdp
                    ),
                    text = "2 x Items",
                    fontSize = 10.ssp,
                    color = Color.Gray
                )

                Icon(
                    modifier = Modifier
                        .padding(start = 3.sdp, top = 0.sdp, end = 0.sdp, bottom = 0.sdp)
                        .rotate(180f),
                    painter = painterResource(id = R.drawable.exclamation),
                    contentDescription = "image exclamation",
                    tint = Color.Blue,
                )

            }

            Row(
                modifier = Modifier
                    .padding(3.sdp)
                    .weight(1f),
                horizontalArrangement = Arrangement.End
            ) {

                Icon(
                    modifier = Modifier
                        .padding(start = 0.sdp, top = 0.sdp, end = 3.sdp, bottom = 0.sdp)
                        .rotate(180f),
                    painter = painterResource(id = R.drawable.exclamation),
                    contentDescription = "image exclamation",
                )


                Text(
                    text = "20.00",
                    fontSize = 10.ssp,
                    color = Color.Black
                )
            }

        }


        Spacer(
            modifier = Modifier.padding(
                start = 0.sdp,
                top = 5.sdp,
                end = 0.sdp,
                bottom = 0.sdp
            )
        )

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(30.sdp),
            border = BorderStroke(3.sdp, Color.White),
        ) {

            Row {
                Row(
                    modifier = Modifier
                        .padding(10.sdp)
                        .weight(1f),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        Icons.Default.Person,
                        contentDescription = "image Person",
                        modifier = Modifier
                            .wrapContentSize(Alignment.TopCenter)
                    )

                    Column(
                        modifier = Modifier.padding(3.sdp)
                    ) {

                        Text(
                            text = "Palestine free",
                            fontSize = 13.ssp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                        Row {

                            Image(
                                Icons.Default.Star,
                                contentDescription = "image Star",
                                colorFilter = ColorFilter.tint(color = Color.Yellow)
                            )

                            Text(
                                text = "2.5",
                                fontSize = 11.ssp,
                                color = Color.Black
                            )

                        }

                    }
                }

                Row(
                    modifier = Modifier
                        .padding(10.sdp)
                        .weight(1f),
                    horizontalArrangement = Arrangement.End
                ) {

                    Icon(
                        Icons.Default.Phone,
                        contentDescription = "image phone",
                        tint = Color(0xFF253BB6),
                        modifier = Modifier.wrapContentSize(Alignment.CenterEnd)
                    )
                }
            }

        }
    }
}


@Composable
private fun LineAfterSection() {
    Divider(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.sdp, top = 5.sdp, end = 10.sdp, bottom = 5.sdp),
        color = Color(0xFFACACAC),
        thickness = 0.sdp
    )
}
